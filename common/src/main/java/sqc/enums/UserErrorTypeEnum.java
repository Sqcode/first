package sqc.enums;

import sqc.exception.ErrorType;

/**
 * @Description: 用户端错误
 * @author: Sqcode
 * @since: 2021/5/21 10:26
 */
public enum UserErrorTypeEnum implements ErrorType {

    A0001("A0001", "用户端错误：一级宏观错误码"),
    A0100("A0100", "用户注册错误：二级宏观错误码"),
    A0210("A0210", "用户账号或密码错误"),
    A0421("A0421", "参数格式不匹配");

//    A0100 用户注册错误 二级宏观错误码
//    A0101 用户未同意隐私协议
//    A0102 注册国家或地区受限
//    A0110 用户名校验失败
//    A0111 用户名已存在
//    A0112 用户名包含敏感词
//    A0113 用户名包含特殊字符
//    A0120 密码校验失败
//    A0121 密码长度不够
//    A0122 密码强度不够
//    A0130 校验码输入错误
//    A0131 短信校验码输入错误
//    A0132 邮件校验码输入错误
//    A0133 语音校验码输入错误
//    A0140 用户证件异常
//    A0141 用户证件类型未选择
//    A0142 大陆身份证编号校验非法
//    A0143 护照编号校验非法
//    A0144 军官证编号校验非法
//    A0150 用户基本信息校验失败
//    A0151 手机格式校验失败
//    A0152 地址格式校验失败
//    A0153 邮箱格式校验失败
//    A0200 用户登录异常 二级宏观错误码
//    A0201 用户账户不存在
//    Java 开发手册
//55/59
//    A0202 用户账户被冻结
//    A0203 用户账户已作废

//    A0211 用户输入密码错误次数超限
//    A0220 用户身份校验失败
//    A0221 用户指纹识别失败
//    A0222 用户面容识别失败
//    A0223 用户未获得第三方登录授权
//    A0230 用户登录已过期
//    A0240 用户验证码错误
//    A0241 用户验证码尝试次数超限
//    A0300 访问权限异常 二级宏观错误码
//    A0301 访问未授权
//    A0302 正在授权中
//    A0303 用户授权申请被拒绝
//    A0310 因访问对象隐私设置被拦截
//    A0311 授权已过期
//    A0312 无权限使用API
//    A0320 用户访问被拦截
//    A0321 黑名单用户
//    A0322 账号被冻结
//    A0323 非法IP地址
//    A0324 网关访问受限
//    A0325 地域黑名单
//    A0330 服务已欠费
//    A0340 用户签名异常
//    A0341 RSA签名错误
//    A0400 用户请求参数错误 二级宏观错误码
//    A0401 包含非法恶意跳转链接
//    A0402 无效的用户输入
//    Java 开发手册
//56/59
//    A0410 请求必填参数为空
//    A0411 用户订单号为空
//    A0412 订购数量为空
//    A0413 缺少时间戳参数
//    A0414 非法的时间戳参数
//    A0420 请求参数值超出允许的范围

//    A0422 地址不在服务范围
//    A0423 时间不在服务范围
//    A0424 金额超出限制
//    A0425 数量超出限制
//    A0426 请求批量处理总个数超出限制
//    A0427 请求JSON解析失败
//    A0430 用户输入内容非法
//    A0431 包含违禁敏感词
//    A0432 图片包含违禁信息
//    A0433 文件侵犯版权
//    A0440 用户操作异常
//    A0441 用户支付超时
//    A0442 确认订单超时
//    A0443 订单已关闭
//    A0500 用户请求服务异常 二级宏观错误码
//    A0501 请求次数超出限制
//    A0502 请求并发数超出限制
//    A0503 用户操作请等待
//    A0504 WebSocket连接异常
//    A0505 WebSocket连接断开
//    A0506 用户重复请求
//    A0600 用户资源异常 二级宏观错误码
//    A0601 账户余额不足
//    Java 开发手册
//57/59
//    A0602 用户磁盘空间不足
//    A0603 用户内存空间不足
//    A0604 用户OSS容量不足
//    A0605 用户配额已用光 蚂蚁森林浇水数或每天抽奖数
//    A0700 用户上传文件异常 二级宏观错误码
//    A0701 用户上传文件类型不匹配
//    A0702 用户上传文件太大
//    A0703 用户上传图片太大
//    A0704 用户上传视频太大
//    A0705 用户上传压缩文件太大
//    A0800 用户当前版本异常 二级宏观错误码
//    A0801 用户安装版本与系统不匹配
//    A0802 用户安装版本过低
//    A0803 用户安装版本过高
//    A0804 用户安装版本已过期
//    A0805 用户API请求版本不匹配
//    A0806 用户API请求版本过高
//    A0807 用户API请求版本过低
//    A0900 用户隐私未授权 二级宏观错误码
//    A0901 用户隐私未签署
//    A0902 用户摄像头未授权
//    A0903 用户相机未授权
//    A0904 用户图片库未授权
//    A0905 用户文件未授权
//    A0906 用户位置信息未授权
//    A0907 用户通讯录未授权
//    A1000 用户设备异常 二级宏观错误码
//    A1001 用户相机异常
//    A1002 用户麦克风异常
//    A1003 用户听筒异常
//    Java 开发手册
//58/59
//    A1004 用户扬声器异常
//    A1005 用户GPS定位异常

    private String code;

    private String msg;

    UserErrorTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
