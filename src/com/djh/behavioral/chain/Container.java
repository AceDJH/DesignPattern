package com.djh.behavioral.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author AceDJH
 * @Date 2021/1/25 12:04
 */
// 容器可以将简单组件和其他容器作为其子项目。链关系将在这里建立。该类将从
// 其父类处继承 showHelp（显示帮助）的行为。
// 通过add方法,在这里组成链表
public abstract class Container extends Component{
    // protected List<Component> children = new ArrayList<>();
    public void add(Component child){
        // children.add(child);
        child.container = this;
    }
}
