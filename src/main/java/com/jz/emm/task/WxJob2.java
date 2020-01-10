package com.jz.emm.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class WxJob2 {

   /* @Resource(name = "emm.commonDao")
    private ICommonDao commonDao;*/
    /**
     * 定时计算。每天凌晨 02:00 执行一次
     */
    @Scheduled(cron = "0/1 * * * * *")
    public void execute(){
        try {
            System.out.println("=========================dingshiqis");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
