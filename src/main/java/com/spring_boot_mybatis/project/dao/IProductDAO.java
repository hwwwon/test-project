package com.spring_boot_mybatis.project.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_boot_mybatis.project.model.ProductVO;



public interface IProductDAO {

	//전체 상품정보 조회
		ArrayList<ProductVO> listAllProduct();
		
		//상품정보 등록
		void insertProduct(ProductVO prd);
		
		//상품정보 수정
		void updateProduct(ProductVO prd);
		
		//상품정보 삭제
		void deleteProduct(String prdNo);
		
		//상세 상품 정보 조회(1개의 상품만 조회)
		ProductVO detailViewProduct(String prdNo);
		
		//상품 번호 중복 체크
		String prdNoCheck(String prdNo);
		
		//상품 검색
		ArrayList<ProductVO> productSearch(HashMap<String, Object> map);
	
}
