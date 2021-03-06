package me.chanjar.weixin.cp.api;

import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.cp.bean.WxCpAuthAdminInfo;
import me.chanjar.weixin.cp.bean.WxCpAuthInfo;
import me.chanjar.weixin.cp.bean.WxCpMaJsCode2SessionResult;
import me.chanjar.weixin.cp.bean.WxCpXmlMessage;
import me.chanjar.weixin.cp.config.WxCpSuiteConfigStorage;

/**
 * <pre>
 *  企业微信 第三方应用接口
 *  Created by Lirichen on 2018/11/19.
 * </pre>
 *
 * @author <a href="https://github.com/eanfs">Binary Wang</a>
 */
public interface WxCpSuiteComponentService {

  String SUITE_AUTH_URL = "https://qyapi.weixin.qq.com/cgi-bin/service/get_suite_token";
  String PRE_AUTH_CODE_URL = "https://qyapi.weixin.qq.com/cgi-bin/service/get_pre_auth_code";
  String SESSEION_INFO_URL = "https://qyapi.weixin.qq.com/cgi-bin/service/set_session_info";
  String PERMANENT_CODE_URL = "https://qyapi.weixin.qq.com/cgi-bin/service/get_permanent_code";
  String AUTH_INFO_URL = "https://qyapi.weixin.qq.com/cgi-bin/service/get_auth_info";
  String CORP_TOKEN_URL = "https://qyapi.weixin.qq.com/cgi-bin/service/get_corp_token";

  // 获取应用的管理员列表
  String CORP_ADMINISTRATOR_URL = "https://qyapi.weixin.qq.com/cgi-bin/service/get_admin_list";

  // 服务商公费电话接口
  String AUTH_CORP_DIAL_URL = "https://qyapi.weixin.qq.com/cgi-bin/service/dial";


  String MINIAPP_JSCODE_2_SESSION = "https://qyapi.weixin.qq.com/cgi-bin/service/miniprogram/jscode2session";

  String GET_PROVIDER_ACCESS_TOKEN = "https://qyapi.weixin.qq.com/cgi-bin/service/get_provider_token";

  String route(WxCpXmlMessage wxMessage) throws WxErrorException;

  WxCpSuiteConfigStorage getWxCpSuiteConfigStorage();

  String getProviderAccessToken(boolean forceRefresh) throws WxErrorException;

  String getSuiteAccessToken(boolean forceRefresh) throws WxErrorException;

  String getPreAuthCode() throws WxErrorException;

  String getSessionInfo() throws WxErrorException;

  WxCpAuthInfo getPermanentCode(String authCorpId, String preAuthCode) throws WxErrorException;

  WxCpAuthInfo getAuthInfo(String authCorpId, String permanentCode) throws WxErrorException;

  void updatePermanentCode(String authCorpId, String permanentCode) throws WxErrorException;

  String getAuthCorpAccessToken(String authCorpId) throws WxErrorException;

  WxCpService getWxCpServiceByAuthCorpId(String authCorpId);

  String getAuthCorpAccessToken(String authCorpId, boolean forceRefresh) throws WxErrorException;

  WxCpAuthAdminInfo getAuthCorpAdmin(String authCorpId, Integer agentId) throws WxErrorException;

  void dialAuthCorp(String authCorpId, String caller, String callee) throws WxErrorException;

  /**
   * 第三方小程序登录凭证校验
   *
   * @param jsCode 登录时获取的 code
   */
  WxCpMaJsCode2SessionResult jsCode2Session(String jsCode) throws WxErrorException;

}
