package by.itstep.internetShop.dto.response;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RoleDto {
    private Long id;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 50, message = "{role.name.size}")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
