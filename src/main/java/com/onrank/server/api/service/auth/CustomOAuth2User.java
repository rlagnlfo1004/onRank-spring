package com.onrank.server.api.service.auth;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;

import java.util.Collection;
import java.util.Map;

@Getter
public class CustomOAuth2User extends DefaultOAuth2User {
    private final String email;
    private final boolean isNewUser;

    public CustomOAuth2User(Collection<? extends GrantedAuthority> authorities,
                            Map<String, Object> attributes,
                            String nameAttributeKey,
                            String email,
                            boolean isNewUser) {
        super(authorities, attributes, nameAttributeKey);
        this.email = email;
        this.isNewUser = isNewUser;
    }
}
