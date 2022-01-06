package com.koreait.ex11.repository;

import java.util.List;

import com.koreait.ex11.domain.Notice;

public interface NoticeRepository {

	// 1 selectNoticeList
	public List<Notice> selectNoticeList();
	// 2. selectNoticeByNo
	public Notice selectNoticeByNo(Long no);
	// 3. insertNotice
	public int insertNotice(Notice notice);
	// 4. updateNotice
	public int updateNotice(Notice notice);
	// 5. deleteNotice
	public int deleteNotice(Long no);
	
}
