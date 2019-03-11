package me.chanjar.weixin.cp.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.cp.bean.article.MpContentItem;
import me.chanjar.weixin.cp.bean.article.MpnewsArticle;
import me.chanjar.weixin.cp.bean.article.NewArticle;
import me.chanjar.weixin.cp.bean.messagebuilder.*;
import me.chanjar.weixin.cp.util.json.WxCpGsonBuilder;

/**
 * 消息.
 *
 * @author Daniel Qian
 */
@Data
public class WxCpMessage implements Serializable {
  private static final long serialVersionUID = -2082278303476631708L;

  private String toUser;
  private String toParty;
  private String toTag;
  private Integer agentId;
  private String msgType;
  private String content;
  private String mediaId;
  private String thumbMediaId;
  private String title;
  private String description;
  private String appId;
  private String page;
  private Boolean emphasisFirstItem;
  private String musicUrl;
  private String hqMusicUrl;
  private String safe;
  private String url;
  private String btnTxt;
  private List<NewArticle> articles = new ArrayList<>();
  private List<MpnewsArticle> mpnewsArticles = new ArrayList<>();
  private List<MpContentItem> contentItems = new ArrayList<>();

  /**
   * 获得文本消息builder.
   */
  public static TextBuilder TEXT() {
    return new TextBuilder();
  }

  /**
   * 获得文本卡片消息builder.
   */
  public static TextCardBuilder TEXTCARD() {
    return new TextCardBuilder();
  }

  /**
   * 获得图片消息builder.
   */
  public static ImageBuilder IMAGE() {
    return new ImageBuilder();
  }

  /**
   * 获得语音消息builder.
   */
  public static VoiceBuilder VOICE() {
    return new VoiceBuilder();
  }

  /**
   * 获得视频消息builder.
   */
  public static VideoBuilder VIDEO() {
    return new VideoBuilder();
  }

  /**
   * 获得图文消息builder.
   */
  public static NewsBuilder NEWS() {
    return new NewsBuilder();
  }

  /**
   * 获得mpnews图文消息builder.
   */
  public static MpnewsBuilder MPNEWS() {
    return new MpnewsBuilder();
  }

  /**
   * 获得文件消息builder.
   */
  public static FileBuilder FILE() {
    return new FileBuilder();
  }

  /**
   * 获得小程序消息 builder.
   */
  public static MiniAppNoticeBuilder MPNOTICE() {
    return new MiniAppNoticeBuilder();
  }


  /**
   * <pre>
   * 请使用
   * {@link WxConsts.KefuMsgType#TEXT}
   * {@link WxConsts.KefuMsgType#IMAGE}
   * {@link WxConsts.KefuMsgType#VOICE}
   * {@link WxConsts.KefuMsgType#MUSIC}
   * {@link WxConsts.KefuMsgType#VIDEO}
   * {@link WxConsts.KefuMsgType#NEWS}
   * {@link WxConsts.KefuMsgType#MPNEWS}
   * {@link WxConsts.KefuMsgType#MINIPROGRAMNOTICE}
   * </pre>
   *
   * @param msgType 消息类型
   */
  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }

  public String toJson() {
    return WxCpGsonBuilder.create().toJson(this);
  }

}
