package com.tnc.userManagement.service.security.listener;

import com.tnc.userManagement.service.security.UserPrincipal;
import com.tnc.userManagement.service.security.preventBrooteForceAttack.LoginAttemptService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthenticationSuccessListener {
    private final LoginAttemptService loginAttemptService;

    @EventListener
    public void onAuthenticationSuccess(AuthenticationSuccessEvent event) {
        Object principal = event.getAuthentication().getPrincipal();
        if (principal instanceof UserPrincipal) {
            var user = (UserPrincipal) event.getAuthentication().getPrincipal();
            loginAttemptService.evictUserForLoginAttemptCache(user.getUsername());
        }
    }
}
