package com.ywh.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MyPlugin  implements Plugin<Project> {
    // 当插件apply时调用
    @Override
    public void apply(Project project) {
        System.out.println("----ywh自定义插件----");
    }
}
