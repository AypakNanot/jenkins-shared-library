import cn.hutool.core.util.StrUtil

def call(body) {
    // 定义入参
    println body
    def result = StrUtil.equals("abc", "ABC")
    println(result)
}

call()