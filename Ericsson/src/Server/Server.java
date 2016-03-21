package Server;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harold_LIU on 3/20/16.
 */
public class Server {

    static private List<User> users = new ArrayList<User>();
    static private int validLoginTime = 0;
    static private int invalidLoginTime = 0;

    private void userInit()
    {
        users.add(new User("liu","123",false,0,0,0));
        users.add(new User("zhao","123",false,0,0,0));
        users.add(new User("qian","123",false,0,0,0));
        users.add(new User("sun","123",false,0,0,0));
        users.add(new User("li", "123", false, 0, 0, 0));
    }

    public  Server ()
    {
        userInit();
    }

    private boolean checkTime(User user)
    {
        long current = System.currentTimeMillis(); // 当前时间

        if (user.loginRequsetTime ==0)
        {

            user.loginDate = current;
            user.loginRequsetTime ++;
            return  true;
        }
        else if (current-user.loginDate < 1000)
        {

            if(user.loginRequsetTime<5)
            {
                System.out.println(user.loginRequsetTime);
                user.loginRequsetTime++;
                return  true;
            }
            else
                return false;
        }
        else
        {
            user.loginRequsetTime = 0;
            return  true;
        }

    }

    private User findUser(String userName)
    {
        for (int i = 0; i<users.size();i++) {
            if (userName.equals(users.get(i).UserName)) {
                return users.get(i);
            }
        }
        return null;
    }

    public int login (String userName, String password)
    {
        User theUser = findUser(userName);
        if(!theUser.equals(null))
        {
            if (checkTime(theUser))
            {
                if (password.equals(theUser.Password)) {
                    validLoginTime++;
                    theUser.isLogin = true;
                    return 200;
                }
                else
                {
                    invalidLoginTime++;
                    return 201;
                }
            }
            else
            {
                invalidLoginTime++;
                return 203;
            }
        }
        else
        {
            invalidLoginTime ++;
            return 202;
        }
    }

    public boolean checkConnection(String userName)
    {
        User theUser = findUser(userName);

        if(!theUser.equals(null))
        {
           if (theUser.isLogin)
               return  true;
           else
               return false;
        }
        else
            return false;

    }

    public void sendMessages(String msg,String senderName ) {
        User sender = findUser(senderName);
        if (!sender.equals(null) && sender.isLogin) {
            sender.sendMessagesNum++;
            if (sender.sendMessagesNum < 100) {

                for (int i = 0; i < users.size(); i++) {
                    if (!sender.equals(users.get(i)) && users.get(i).isLogin) {
                        //send msg action here
                    }
                }
            } else {
                sender.isLogin = false;
                sender.sendMessagesNum = 0;
                // send to client log out
            }
        }
    }
// Login test passed

}
