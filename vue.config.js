/*
 * vue配置
 * @Author: Hello
 * @Date: 2024-11-19
 */
module.exports = {
    lintOnSave: false,
    devServer: {
        host: "localhost",
        port: 9282,
        https: false,
        proxy: "http://localhost:9281",
        overlay: {
            warning: false,
            errors: false
        },
    }
}
