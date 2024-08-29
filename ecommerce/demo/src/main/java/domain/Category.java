package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {

    private long id;
    private String category_name;
    private long parentCategory;//부모카테고리ID 셀프조인

    public Category(String category_name, long parentCategory) {
        this.category_name = category_name;
        this.parentCategory = parentCategory;
    }
}
