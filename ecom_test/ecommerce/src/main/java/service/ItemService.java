package service;

import domain.Review;
import common.Session;
import repository.*;

import java.util.Scanner;

//(상품 등록, 상품 삭제, 상품 수정, 전체 상품 조회) + 카테고리별 조회 + 리뷰 + 장바구니
public class ItemService {

    private final ItemRepository itemRepository;
    private final CategoryRepository categoryRepository;
    private final CategoryItemRepository categoryItemRepository;
    private final ReviewRepository reviewRepository;

    public ItemService(ItemRepository itemRepository, CategoryRepository categoryRepository, CategoryItemRepository categoryItemRepository, ReviewRepository reviewRepository) {
        this.itemRepository = itemRepository;
        this.categoryRepository = categoryRepository;
        this.categoryItemRepository = categoryItemRepository;
        this.reviewRepository = reviewRepository;
    }

    public void handleItemService(Scanner sc){

        int choice = sc.nextInt();
        ViewItemService();

        switch (choice){
            case 1:
                ViewReviewService();
                switch (choice){
                    case 1: //리뷰보기
                        selectReview();
                        break;

                    case 2: //리뷰작성
                        insertReview(sc);
                        break;

                    case 3: //리뷰수정
                        System.out.println("수정할 리뷰 아이디를 입력해주세요.");
                        Long reviewId = sc.nextLong();
                        // 권한 확인
                        Long memberId = Session.getInstance().getCurrentMember().getMemberId();

                        //샀는지 안샀는지
//                        if()

                        System.out.println("수정할 별점을 입력해 주세요.");
                        int stars = sc.nextInt();
                        System.out.println("수정할 리뷰 내용을 입력해주세요.");
                        String contents = sc.next();

                        Review review = Review.of(reviewId, stars, contents);
                        reviewRepository.update(review);
                        break;

                    case 4: //리뷰삭제
                        deleteReview(sc);
                        break;

                    default:
                        ServiceBreak();
                }
            default:
                ServiceBreak();
        }
    }

    private void selectReview() {
        // 권한 확인
        Long memberId = Session.getInstance().getCurrentMember().getMemberId();
        reviewRepository.select();
    }

    private void deleteReview(Scanner scan) {
        System.out.println("삭제할 리뷰의 아이디를 입력해 주세요.");
        Long reviewId = scan.nextLong();
        // 권한 확인
        Long memberId = Session.getInstance().getCurrentMember().getMemberId();


        reviewRepository.delete(reviewId);
    }

    private void insertReview(Scanner scan) {
        System.out.println("리뷰를 남기실 상품 ID를 입력해주세요.");
        Long itemId = scan.nextLong();
        //해당 상품을 구매한 이력이 있는지 체크

        //성공 시
        System.out.println("평점을 입력해주세요.");
        int stars = scan.nextInt();
        System.out.println("내용을 입력해주세요.");
        String contents = scan.next();
        // 연구대상
        Long memberId = Session.getInstance().getCurrentMember().getMemberId();

        Review review = Review.of(stars, contents,memberId,itemId);
        reviewRepository.insert(review);
    }

    private static void ViewItemService() {
        System.out.println("""
                1. 리뷰서비스
                2. ~~~~
                3. ~~~~
                """);
    }

    private static void ViewReviewService() {
        System.out.println("""
                1. 리뷰보기
                2. 리뷰작성
                3. 리뷰수정
                4. 리뷰삭제
                """);
    }
    
    private static void ServiceBreak() {
        System.out.println("잘못된 번호 입니다.");
    }

}
