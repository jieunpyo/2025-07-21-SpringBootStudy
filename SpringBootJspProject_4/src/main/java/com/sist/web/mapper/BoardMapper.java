package com.sist.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.sist.web.vo.BoardVO;

@Mapper
@Repository
public interface BoardMapper {
	// 리스트
	@Select("SELECT no, name, subject, content, TO_CHAR(regdate,'yyyy-mm-dd' as dbday "
		   +"FROM board_1 ORDER BY no DESC "
		   +"OFFSET #{start} ROWS FETCH NEXT 12 ROWS ONLY")
	public List<BoardVO> boardListData(int start);
	
	// 토탈 페이지
	@Select("SELECT CEIL(COUNT(*)/10.0) FROM board_1")
	public int boardTotalpage();
	
	// 글쓰기
	@SelectKey(keyProperty = "no", resultType = int.class, before = true,
			statement = "SELECT NVL(MAX(no)+1,1) FROM board_1")
	@Insert("INSERT INTO board_1 VALUSE("
		   +"#{no},#{name},#{subject},#{content},#{pwd},SYSDATE,0)")
	public void boardInsert(BoardVO vo);
	
	// 조회수
	@Update("UPDATE board_1 SET hit=hit+1 WHERE no=#{no}")
	public void boardHitIncrement(int no);
	
	// 상세보기
	@Select("SELECT no,name,subject,content, TO_CHAR(regdate,'yyyy-mm-dd' as dbday, hit "
		    +"FROM board_1"
		    +"WHERE no=#{no}")
	public BoardVO boardDetailData(int no);
	
	// 삭제
	@Delete("DELETE FROM board_1 WHERE no=#{no}")
	public void boardDelete(int no);
	
	// 수정
	@Update("UPDATE SET board_1 "
		   +"name=#{name}, subject=#{subject}, centent=#{content} "
		   +"WHERE no=#{no}")
	public void boardUpdate(int no);
	
	
	
}
