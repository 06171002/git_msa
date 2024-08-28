package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Category {

    private long id;
    private String categoryId;
    private long parentCategory;//부모카테고리ID 셀프조인



}
