package kr.co.dwebss.kococo.web;
import kr.co.dwebss.kococo.core.Result;
import kr.co.dwebss.kococo.core.ResultGenerator;
import kr.co.dwebss.kococo.model.Analysis;
import kr.co.dwebss.kococo.service.AnalysisService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2019/06/27.
*/
@RestController
@RequestMapping("/analysis")
public class AnalysisController {
    @Resource
    private AnalysisService analysisService;

    @PostMapping("/add")
    public Result add(Analysis analysis) {
        analysisService.save(analysis);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        analysisService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Analysis analysis) {
        analysisService.update(analysis);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Analysis analysis = analysisService.findById(id);
        return ResultGenerator.genSuccessResult(analysis);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Analysis> list = analysisService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
