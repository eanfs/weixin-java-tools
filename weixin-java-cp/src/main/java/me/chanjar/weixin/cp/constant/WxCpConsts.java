package me.chanjar.weixin.cp.constant;

/**
 * <pre>
 * 企业微信常量
 * Created by Binary Wang on 2018/8/25.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
public class WxCpConsts {

  /**从企业微信应用市场发起授权时, 授权成功后 suite_ticket*/
  public static final String REDIS_KEY_SUITE_TICKET = "esenyun_wxcp:suite_ticket:";

  /**第三方服务商 自用的Suite Access Token*/
  public static final String REDIS_KEY_SUITE_ACCESS_TOKEN = "esenyun_wxcp:suite_access_token:";

  /**授权方提供的 获取企业永久授权码*/
  public static final String REDIS_KEY_CROP_PERMANENT_CODE = "esenyun_wxcp:crop_permanent_code:";

  /** 获取企业永久授权码 AccessToken */
  public static final String REDIS_KEY_CROP_ACCESS_TOKEN = "esenyun_wxcp:crop_access_token:";

  /** 从企业微信应用市场发起授权时, 授权成功后*/
  public static final String REDIS_KEY_SUITE_AUTH = "esenyun_wxcp:suite_auth:";

  public static final String WX_MESSAGE_TYPE_CREATE_AUTH = "create_auth";

  public static final String WX_MESSAGE_TYPE_CANCEL_AUTH = "cancel_auth";

  public static final String WX_MESSAGE_TYPE_SUITE_TICKET = "suite_ticket";

  /**
   * 企业微信端推送过来的事件类型.
   * 参考文档：https://work.weixin.qq.com/api/doc#12974
   */
  public static class EventType {
    /**
     * 成员关注事件.
     */
    public static final String SUBSCRIBE = "subscribe";

    /**
     * 成员取消关注事件.
     */
    public static final String UNSUBSCRIBE = "unsubscribe";

    /**
     * 进入应用事件.
     */
    public static final String ENTER_AGENT = "enter_agent";

    /**
     * 上报地理位置.
     */
    public static final String LOCATION = "LOCATION";

    /**
     * 异步任务完成事件推送.
     */
    public static final String BATCH_JOB_RESULT = "batch_job_result";

    /**
     * 企业微信通讯录变更事件.
     */
    public static final String CHANGE_CONTACT = "change_contact";

    /**
     * 点击菜单拉取消息的事件推送.
     */
    public static final String CLICK = "click";

    /**
     * 点击菜单跳转链接的事件推送.
     */
    public static final String VIEW = "view";

    /**
     * 扫码推事件的事件推送.
     */
    public static final String SCANCODE_PUSH = "scancode_push";

    /**
     * 扫码推事件且弹出“消息接收中”提示框的事件推送.
     */
    public static final String SCANCODE_WAITMSG = "scancode_waitmsg";

    /**
     * 弹出系统拍照发图的事件推送.
     */
    public static final String PIC_SYSPHOTO = "pic_sysphoto";

    /**
     * 弹出拍照或者相册发图的事件推送.
     */
    public static final String PIC_PHOTO_OR_ALBUM = "pic_photo_or_album";

    /**
     * 弹出微信相册发图器的事件推送.
     */
    public static final String PIC_WEIXIN = "pic_weixin";

    /**
     * 弹出地理位置选择器的事件推送.
     */
    public static final String LOCATION_SELECT = "location_select";

    /**
     * 任务卡片事件推送.
     */
    public static final String TASKCARD_CLICK = "taskcard_click";

    /**
     * 企业成员添加外部联系人事件推送
     */
    public static final String CHANGE_EXTERNAL_CONTACT = "change_external_contact";


  }

  /**
   * 企业外部联系人变更事件的CHANGE_TYPE
   */
  public static class ExternalContactChangeType {
    /**
     * 新增外部联系人
     */
    public static final String ADD_EXTERNAL_CONTACT = "add_external_contact";
    /**
     * 删除外部联系人
     */
    public static final String DEL_EXTERNAL_CONTACT = "del_external_contact";
  }

  /**
   * 企业微信通讯录变更事件.
   */
  public static class ContactChangeType {
    /**
     * 新增成员事件.
     */
    public static final String CREATE_USER = "create_user";

    /**
     * 更新成员事件.
     */
    public static final String UPDATE_USER = "update_user";

    /**
     * 删除成员事件.
     */
    public static final String DELETE_USER = "delete_user";

    /**
     * 新增部门事件.
     */
    public static final String CREATE_PARTY = "create_party";

    /**
     * 更新部门事件.
     */
    public static final String UPDATE_PARTY = "update_party";

    /**
     * 删除部门事件.
     */
    public static final String DELETE_PARTY = "delete_party";

    /**
     * 标签成员变更事件.
     */
    public static final String UPDATE_TAG = "update_tag";

  }

  /**
   * 应用推送消息的消息类型.
   */
  public static class AppChatMsgType {
    /**
     * 文本消息.
     */
    public static final String TEXT = "text";
    /**
     * 图片消息.
     */
    public static final String IMAGE = "image";
    /**
     * 语音消息.
     */
    public static final String VOICE = "voice";
    /**
     * 视频消息.
     */
    public static final String VIDEO = "video";
    /**
     * 发送文件（CP专用）.
     */
    public static final String FILE = "file";
    /**
     * 文本卡片消息（CP专用）.
     */
    public static final String TEXTCARD = "textcard";
    /**
     * 图文消息（点击跳转到外链）.
     */
    public static final String NEWS = "news";
    /**
     * 图文消息（点击跳转到图文消息页面）.
     */
    public static final String MPNEWS = "mpnews";
    /**
     * markdown消息.
     */
    public static final String MARKDOWN = "markdown";
  }

  /**
   * 企业微信端推送过来的事件类型.
   * 参考文档：https://work.weixin.qq.com/api/doc#12974
   */
  public static class SuiteEventType {
    /**
     * 授权成功通知事件.
     */
    public static final String CREATE_AUTH = "create_auth";

    /**
     * 变更授权通知事件.
     */
    public static final String CHANGE_AUTH = "change_auth";

    /**
     * 取消授权通知事件.
     */
    public static final String CANCEL_AUTH = "cancel_auth";

    /**
     * 进入应用事件.
     */
    public static final String SUITE_TICKET = "suite_ticket";

  }

  /**
   * 企业微信端推送过来的事件类型.
   * 参考文档：https://work.weixin.qq.com/api/doc#15219
   */
  public static class SuitePayEventType {
    /**
     * 下单成功通知.
     */
    public static final String OPEN_ORDER = "open_order";

    /**
     * 改单通知.
     */
    public static final String CHANGE_ORDER = "change_order";

    /**
     * 支付成功通知.
     */
    public static final String PAY_SUCCESS = "pay_for_app_success";

    /**
     * 退款通知.
     */
    public static final String REFUND = "refund";

    /**
     * 付费版本变更通知.
     */
    public static final String CHANGE_EDITION = "change_editon";

  }
}
