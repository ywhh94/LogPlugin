package com.ywh.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

class MyPlugin implements Plugin<Project> {
    // 当插件apply时调用
    @Override
    public void apply(Project project) {
        System.out.println("--------apply MyPlugin---------");

        project.tasks.create("ywhLogPlugin")
                .doLast {
                    System.out.println("--------ywhLogPlugin开始执行咯---------");
                }
                .setGroup("ywhplguin")
    }

}
