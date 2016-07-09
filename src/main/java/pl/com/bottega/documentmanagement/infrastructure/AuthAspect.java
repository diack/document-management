package pl.com.bottega.documentmanagement.infrastructure;

import org.springframework.stereotype.Component;
import pl.com.bottega.documentmanagement.api.AuthRequiredException;
import pl.com.bottega.documentmanagement.api.UserManager;

/**
 * Created by Wojciech Winiarski on 09.07.2016.
 */
@Component("authAspect")
public class AuthAspect {

    private UserManager userManager;

    public AuthAspect(UserManager userManager){
        this.userManager = userManager;
    }

    public void checkAuth(){

        if (!userManager.isAuthenticated()){
            throw new AuthRequiredException();
        }

    }

}
