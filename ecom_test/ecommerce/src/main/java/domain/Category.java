package domain;

public class Category {
    private Long categoryId;
    private String categoryName;
    private Long parentCategory;//부모카테고리ID 셀프조인

    public Category(String category_name, long parentCategory) {
        this.categoryName = category_name;
        this.parentCategory = parentCategory;
    }
}
