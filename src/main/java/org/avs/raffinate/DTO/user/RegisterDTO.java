package org.avs.raffinate.DTO.user;

import org.avs.raffinate.domain.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
