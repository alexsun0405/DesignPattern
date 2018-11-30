package com.dp.section2;

/**
 * 删除页面指令
 */
public class DeletePageCommand extends Command {

    @Override
    public void execute() {
        // 找到页面组
        super.pg.find();
        // 删除页面
        super.pg.delete();
        // 给出计划
        super.pg.plan();
    }

}
