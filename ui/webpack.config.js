const { VueLoaderPlugin } = require('vue-loader');

module.exports = {
	entry: "./main.js", //入口文件
	output: {
		path: __dirname + "/dist/",
		filename: "index.js"
	},
	module: {
		rules: [{
            test: /\.vue$/,
            use: ['vue-loader']
        },{
			test: /\.js$/,
			use: ['babel-loader'],
			exclude: /node_modules/
		},{
			test: /\.less$/,
			loaders: ["style-loader", "css-loader", "less-loader"]
		}, {
			test: /\.css$/,
			loaders: ["style-loader", "css-loader"]
		}]
	},
    plugins: [
        // 添加VueLoaderPlugin，以响应vue-loader
        new VueLoaderPlugin()
    ],
    devServer: {
        port: 8090,
        hot: true,
        open: true,
        contentBase : './',
		inline: true
    }
};