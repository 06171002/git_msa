package domain;

import lombok.Getter;

@Getter
public class CategoryItem {

    private Long id;
    private Long itemId;
    private Long categoryId;
    // itemID,categoryId FK

    public CategoryItem(Long itemId, Long categoryId) {
        this.itemId = itemId;
        this.categoryId = categoryId;
    }
}
