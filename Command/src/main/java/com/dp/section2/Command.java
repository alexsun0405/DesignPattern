package com.dp.section2;

public abstract class Command {
    protected CodeGroup cg = new CodeGroup();
    protected PageGroup pg = new PageGroup();
    protected RequirementGroup rg = new RequirementGroup();

    public abstract void execute();
}
