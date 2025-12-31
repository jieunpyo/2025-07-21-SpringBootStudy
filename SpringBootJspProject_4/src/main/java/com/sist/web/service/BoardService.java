package com.sist.web.service;

import java.util.List;

import com.sist.web.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> boardListData(int start);
	public int boardTotalpage();
	public void boardInsert(BoardVO vo);
	public BoardVO boardDetailData(int no);
	public void boardDelete(int no);
	public void boardUpdate(BoardVO vo);
}
