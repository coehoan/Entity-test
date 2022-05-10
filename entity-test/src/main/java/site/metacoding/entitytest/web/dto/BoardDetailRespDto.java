package site.metacoding.entitytest.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardDetailRespDto {
    private Integer id;
    private String title;
    private String content;
    private boolean isLove;

    // 오브젝트 매핑
    // private UserDto user;

    // class UserDto{
    // private Integer id;
    // private String username;
    // private String password;
    // }
}
