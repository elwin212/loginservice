package com.elwin.login.registration.token;

import com.elwin.login.appuser.AppUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ConfirmationToken {
    @Id
    @SequenceGenerator(name = "confirmation_token_sequence", sequenceName = "confirmation_token_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "confirmation_token_sequence")
    private Long id;

    @Column(nullable = false)
    private String token;
    @Column(nullable = false)
    private LocalDateTime createTime;
    @Column(nullable = false)
    private LocalDateTime expiredTime;

    private LocalDateTime confirmedTime;
    @ManyToOne
    @JoinColumn(nullable = false,name = "app_user_id")
    private AppUser appUser;


    public ConfirmationToken(String token, LocalDateTime createTime, LocalDateTime expiredTime, AppUser appUser) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTime = expiredTime;
        this.appUser = appUser;
    }

    public LocalDateTime getExpiresAt() {
        return expiredTime;
    }

    public LocalDateTime getConfirmedAt() {
        return confirmedTime;
    }
}
