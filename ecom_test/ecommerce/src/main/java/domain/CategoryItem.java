package domain;

public class CategoryItem {
    private Long categoryItemId;
    private Long itemId;
    private Long categoryId;
    // itemID,categoryId FK

    public CategoryItem(Long itemId, Long categoryId) {
        this.itemId = itemId;
        this.categoryId = categoryId;
    }
}
