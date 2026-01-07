package com.sist.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.sist.web.vo.BoardVO;

@Mapper
@Repository
public interface BoardMapper {
	@Select("SELECT no,subject,name,TO_CHAR(regdate,'yyyy-mm-dd' AS dbday, hit "
		   +"FROM board_1 ORDER BY no ASC "
		   +"OFFSET #{start} ROWS FETCH NEXT 12 ROWS ONLY")
	public List<BoardVO> boardListData(int start);
	
	@Select("SELECT CEIL(COUNT(*)/12.0) FROM board_1")
	public int boardTotalPage();
	
}