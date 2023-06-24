package com.evalcony.jobs;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.SneakyThrows;
import org.noear.solon.annotation.Component;

@Component
public class JobHandler {
    @SneakyThrows
    @XxlJob("jobHandler")
    public void job() {
        XxlJobHelper.log("XXL-JOB, Hello World.");
    }
}
