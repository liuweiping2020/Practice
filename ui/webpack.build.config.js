const merge = require('webpack-merge');
const common = require('./webpack.config.js');
const webpack = require('webpack');
const HtmlWebpackPlugin = require('html-webpack-plugin');
module.exports = merge(common, {
    output: {
        path: __dirname + "/../src/main/webapp/assets/dist/",
        filename: "[name].js"
    },
    plugins: [
        new HtmlWebpackPlugin({
            title: '首页',
            template: 'index.html',
            filename: 'index.html',
            hash: true,
            chunks: ["index"],
            chunksSortMode: 'manual'
        }),
        new webpack.NamedModulesPlugin(),
        new webpack.optimize.UglifyJsPlugin({
            compress: {
                warnings: false
            }
        })
    ],
    devtool: 'inline-source-map'
});