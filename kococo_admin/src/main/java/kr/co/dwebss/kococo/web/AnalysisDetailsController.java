package kr.co.dwebss.kococo.web;
import kr.co.dwebss.kococo.core.Result;
import kr.co.dwebss.kococo.core.ResultGenerator;
import kr.co.dwebss.kococo.model.AnalysisDetails;
import kr.co.dwebss.kococo.service.AnalysisDetailsService;
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
@RequestMapping("/analysis/details")
public class AnalysisDetailsController {
    @Resource
    private AnalysisDetailsService analysisDetailsService;

    @PostMapping("/add")
    public Result add(AnalysisDetails analysisDetails) {
        analysisDetailsService.save(analysisDetails);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        analysisDetailsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(AnalysisDetails analysisDetails) {
        analysisDetailsService.update(analysisDetails);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        AnalysisDetails analysisDetails = analysisDetailsService.findById(id);
        return ResultGenerator.genSuccessResult(analysisDetails);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<AnalysisDetails> list = analysisDetailsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
