package domain;

import lombok.Getter;

@Getter
public class Category {

    private Long id;
    private String category_name;
    private Long parentCategory;//부모카테고리ID 셀프조인

    public Category(String category_name, long parentCategory) {
        this.category_name = category_name;
        this.parentCategory = parentCategory;
    }
}
