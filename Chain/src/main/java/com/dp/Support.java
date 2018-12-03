package com.dp;

import lombok.Data;

@Data
public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        // 尝试解决
        if (resolve(trouble)) {
            // 解决了
            done(trouble);
        } else if (next != null) {
            // 给下一个人解决
            next.support(trouble);
        } else {
            // 没人能解决，失败了。
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);

    private void fail(Trouble trouble) {
        System.out.println(trouble + " can not be resolved.");
    }

    private void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }
}
