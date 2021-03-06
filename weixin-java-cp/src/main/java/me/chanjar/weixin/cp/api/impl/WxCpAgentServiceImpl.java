package me.chanjar.weixin.cp.api.impl;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import me.chanjar.weixin.common.error.WxError;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.cp.api.WxCpAgentService;
import me.chanjar.weixin.cp.api.WxCpService;
import me.chanjar.weixin.cp.bean.WxCpAgent;
import me.chanjar.weixin.cp.bean.WxCpAgentScope;
import me.chanjar.weixin.cp.bean.WxCpMessageSendResult;
import me.chanjar.weixin.cp.util.json.WxCpGsonBuilder;

import java.util.List;

import static me.chanjar.weixin.cp.constant.WxCpApiPathConsts.Agent.*;


/**
 * <pre>
 *  管理企业号应用
 *  Created by huansinho on 2018/4/13.
 * </pre>
 *
 * @author <a href="https://github.com/huansinho">huansinho</a>
 */
@RequiredArgsConstructor
public class WxCpAgentServiceImpl implements WxCpAgentService {
  private static final JsonParser JSON_PARSER = new JsonParser();

  private final WxCpService mainService;

  @Override
  public WxCpAgent get(Integer agentId) throws WxErrorException {
    if (agentId == null) {
      throw new IllegalArgumentException("缺少agentid参数");
    }

    String responseContent = this.mainService.get(String.format(this.mainService.getWxCpConfigStorage().getApiUrl(AGENT_GET), agentId), null);
    return WxCpAgent.fromJson(responseContent);
  }

  @Override
  public void set(WxCpAgent agentInfo) throws WxErrorException {
    String url = this.mainService.getWxCpConfigStorage().getApiUrl(AGENT_SET);
    String responseContent = this.mainService.post(url, agentInfo.toJson());
    JsonObject jsonObject = JSON_PARSER.parse(responseContent).getAsJsonObject();
    if (jsonObject.get("errcode").getAsInt() != 0) {
      throw new WxErrorException(WxError.fromJson(responseContent));
    }
  }

  @Override
  public WxCpMessageSendResult setScope(WxCpAgentScope agentScope) throws WxErrorException {
    String url = "https://qyapi.weixin.qq.com/cgi-bin/agent/set_scope";
    String responseContent = this.mainService.post(url, agentScope.toJson());
    JsonObject jsonObject = JSON_PARSER.parse(responseContent).getAsJsonObject();
    if (jsonObject.get("errcode").getAsInt() != 0) {
      throw new WxErrorException(WxError.fromJson(responseContent));
    }
    return WxCpMessageSendResult.fromJson(responseContent);
  }

  @Override
  public List<WxCpAgent> list() throws WxErrorException {
    String url = this.mainService.getWxCpConfigStorage().getApiUrl(AGENT_LIST);
    String responseContent = this.mainService.get(url, null);
    JsonObject jsonObject = JSON_PARSER.parse(responseContent).getAsJsonObject();
    if (jsonObject.get("errcode").getAsInt() != 0) {
      throw new WxErrorException(WxError.fromJson(responseContent));
    }

    return WxCpGsonBuilder.create().fromJson(jsonObject.get("agentlist").toString(), new TypeToken<List<WxCpAgent>>() {
    }.getType());
  }

}
