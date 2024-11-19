package com.example.shoppro.repository;

import com.example.shoppro.entity.Item;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item , Long> {

    //제품명으로 검색 제품명은 동일한 이름이 있을수 있으니
    // 여러개 출력가능 List사용


    public List<Item> findByItemNm (String itemNm);

    @Query("select i from Item i where i.itemNm = :itemNm")
    public List<Item> selectwhereItemNm(String itemNm);


    @Query("select i from Item i where i.itemNm like concat('%',:itemNm,'%') ")
    public List<Item> selectWItemNmLike(String itemNm);

    // 상세설명으로 검색
    public List<Item> findByItemDetailContaining(String itemDetail);

    // 가격으로 검색
    public List<Item> findByPriceLessThan (Integer price);
    public List<Item> findByPriceGreaterThan (Integer price);
    public List<Item> findByPriceGreaterThanOrderByPriceAsc (Integer price);


    // 정렬까지 추가
    List<Item> findByPriceLessThanOrderByPriceDesc (Integer price);

    // nativeQuery 사용
    @Query(value = "select * from Item where i.item_Nm = :itemNm", nativeQuery = true)
    List<Item> nativeQuerySelectWhereNamelike(@Param("itemNm") String itemNm, Pageable pageable);



}
