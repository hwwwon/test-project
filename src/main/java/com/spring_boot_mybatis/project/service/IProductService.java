package com.spring_boot_mybatis.project.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_boot_mybatis.project.model.ProductVO;



public interface IProductService {
	
	//전체 상품정보 조회
	public ArrayList<ProductVO> listAllProduct();
	
	//상품정보 등록
	public void insertProduct(ProductVO prd);
	
	//상품정보 수정
	public void updateProduct(ProductVO prd);
	
	//상품정보 삭제
	public void deleteProduct(String prdNo);
	
	//상세 상품 정보 조회(1개의 상품만 조회)
	public ProductVO detailViewProduct(String prdNo);
	
	//상품 번호 중복 체크
	String prdNoCheck(String prdNo);
			
	//상품 검색
	ArrayList<ProductVO> productSearch(HashMap<String, Object> map);

}
