package com.mugu.blog.article.controller.front;

import com.alibaba.fastjson.JSON;
import com.mugu.blog.article.common.model.req.ArticleInfoReq;
import com.mugu.blog.article.common.model.req.ArticleListReq;
import com.mugu.blog.article.common.model.vo.ArticleVo;
import com.mugu.blog.article.service.ArticleService;
import com.mugu.blog.core.model.BaseParam;
import com.mugu.blog.core.model.PageData;
import com.mugu.blog.core.model.ResultMsg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(value = "文章相关接口-后台")
@RestController
@RequestMapping("/front/article")
@Slf4j
public class ArticleFrontController {

    @Autowired
    private ArticleService articleService;

    @ApiOperation("获取文章列表")
    @PostMapping("/list")
    public ResultMsg<PageData<ArticleVo>> list(@RequestBody @Valid ArticleListReq req){
        return ResultMsg.resultSuccess(articleService.list(req));
    }

    @ApiOperation("搜索文章")
    @PostMapping("/search")
    public ResultMsg<PageData<ArticleVo>> search(@RequestBody @Valid BaseParam param) {
        return ResultMsg.resultSuccess(articleService.search(param));
    }

    @ApiOperation("根据ID获取文章详情")
    @PostMapping("/getById")
    public ResultMsg<ArticleVo> getById(@RequestBody @Valid ArticleInfoReq req){
        return ResultMsg.resultSuccess(articleService.getById(req));
    }
}
