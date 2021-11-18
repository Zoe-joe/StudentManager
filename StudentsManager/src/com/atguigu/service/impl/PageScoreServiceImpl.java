package com.atguigu.service.impl;

import com.atguigu.dao.PageScoreDao;
import com.atguigu.dao.impl.PageScoreDaoImpl;
import com.atguigu.pojo.Page;
import com.atguigu.pojo.ScoreList;
import com.atguigu.service.PageScoreService;

import java.util.List;

public class PageScoreServiceImpl implements PageScoreService {
    private PageScoreDao pageScoreDao = new PageScoreDaoImpl();

    @Override
    public void addScore(ScoreList scoreList) {
        pageScoreDao.addScore(scoreList);
    }

    @Override
    public void deleteScore(Integer id) {
        pageScoreDao.deleteScore(id);
    }

    @Override
    public void update(ScoreList scoreList) {
        pageScoreDao.updateScore(scoreList);
    }

    @Override
    public List<ScoreList> queryScores(String studentID) {
        return pageScoreDao.queryScoreByStudentID(studentID);
    }

    @Override
    public ScoreList queryScore(String studentID, String subject) {
        return pageScoreDao.queryScoreByStudentIDAndSubject(studentID,subject);
    }

    @Override
    public Page<ScoreList> page(int pageNo) {
        Page<ScoreList> page = new Page<>();
        page.setPageNo(pageNo);

        Integer pageTotalCount = pageScoreDao.queryForPageTotalCount();
        page.setPageTotalCount(pageTotalCount);

        int pageTotal = pageTotalCount / page.getPageSize();
        if (pageTotalCount % page.getPageSize() > 0) {
            pageTotal++;
        }
        page.setPageTotal(pageTotal);

        int begin = (pageNo - 1) * page.getPageSize();
        page.setItems(pageScoreDao.queryForItems(begin, page.getPageSize()));

        return page;
    }
}
