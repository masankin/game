package com.app.empire.protocol;
public class Protocol {
	public static final byte MAIN_ERROR = -1;
	public static final byte ERROR_ProtocolError = -1;
	/** 服务器间的消息协议 */
	public static final byte MAIN_SERVER = 1;
	public static final byte SERVER_Heartbeat = 1;// 服务器间心跳
	public static final byte SERVER_WorldServerToAccountServer = 2;// world链接账号服务
	public static final byte SERVER_DispatchLogin = 3;// dis链接world
	public static final byte SERVER_UpdateServerInfo = 4;// dis告知ipd 服务器信息-服务已开启
	public static final byte SERVER_NotifyMaxPlayer = 5;// world告知dis人数
	public static final byte SERVER_SyncLoad = 6;// dis告知ipd在线人数等情况
	public static final byte SERVER_AccountLogin = 7;
	public static final byte SERVER_AccountLoginOk = 8;
	public static final byte SERVER_SessionClosed = 9;// dis告知world 用户下线
	public static final byte SERVER_SetClientIPAddress = 10;// 用户链接dis告知world用户ip
	public static final byte SERVER_Kick = 11;// 踢用户下线
	public static final byte SERVER_SyncPlayer = 12;// 玩家角色信息同步(系统内部使用)

	public static final byte SERVER_ServerLogin = 100;
	public static final byte SERVER_ServerLoginOk = 100;
	public static final byte SERVER_ServerLoginFailed = 100;
	// 用户层级登录（GameServer->GameAccountServer->AccountServer)
	public static final byte SERVER_LegacyFindPasswordOk = 100;
	public static final byte SERVER_LegacyFindPassword = 100;
	public static final byte SERVER_LegacyModifyPassword = 100;
	public static final byte SERVER_LegacyModifyPasswordOk = 100;
	public static final byte SERVER_LegacyRegister = 100;
	public static final byte SERVER_LegacyRegisterOk = 100;

	public static final byte SERVER_PlayerLogout = 14; // 玩家登出(主要用这个协议通知)
	public static final byte SERVER_LegacyVerification = 15;
	public static final byte SERVER_LegacyVerificationResult = 16;
	// 查询用户所在服务区信息
	public static final byte SERVER_GetPlayerAreaOk = 21;
	public static final byte SERVER_SetClientInfo = 22; // 设置客户端信息
	// 用户管理（广播，踢下线等）
	public static final byte SERVER_BroadCast = 60;
	public static final byte SERVER_ForceBroadCast = 61;

	public static final byte SERVER_ShutDown = 63;
	// 服务器维护相关（推荐流量最好的服务器）
	public static final byte SERVER_AddBalance = 70;
	public static final byte SERVER_AddBalanceOk = 71;
	public static final byte SERVER_DecBalance = 72;
	public static final byte SERVER_DecBalanceOk = 73;
	public static final byte SERVER_AddRecommendBalance = 74;
	public static final byte SERVER_ChangeStatus = 75;
	public static final byte SERVER_ChangeStatusOk = 76;

	public static final byte SERVER_NotifyMaintance = 80;
	public static final byte SERVER_SendAddress = 81;

	// 更新服务器信息 版本

	public static final byte SERVER_UpdateAccountInfo = 92;
	public static final byte SERVER_UpdateAccountInfoOk = 93;

	/** 用户帐号相关协议（客户端共享） */
	public static final byte MAIN_ACCOUNT = 2;
	public static final byte ACCOUNT_Heartbeat = 1;// 客户端对dis心跳
	public static final byte ACCOUNT_Login = 2;// 用户登录
	public static final byte ACCOUNT_LoginOk = 3;// 登录成功
	public static final byte ACCOUNT_RepeatLogin = 4;// 主账号重复登录
	public static final byte ACCOUNT_GetRoleList = 5;// 获取角色列表
	public static final byte ACCOUNT_GetRoleListOK = 6;
	public static final byte ACCOUNT_RoleCreate = 7;// 角色创建
	public static final byte ACCOUNT_RoleLogin = 8;// 角色登录
	public static final byte ACCOUNT_RoleLoginOk = 9;// 角色登录成功
	public static final byte ACCOUNT_Move = 10;// 角色移动
	public static final byte ACCOUNT_ReportPlace = 11;// 报告位置
	
	
	
	

	public static final byte ACCOUNT_Register = 100;
	public static final byte ACCOUNT_RegisterOk = 100;
	public static final byte ACCOUNT_RegisterFail = 100;
	public static final byte ACCOUNT_ChannelLogin = 15;
	public static final byte ACCOUNT_ChannelLoginResult = 16;

	public static final byte ACCOUNT_GetRandomName = 24;
	public static final byte ACCOUNT_GetRandomNameOk = 25;
	public static final byte ACCOUNT_SetToken = 26;
	public static final byte ACCOUNT_LoginAgain = 30;
	public static final byte ACCOUNT_LoginFail = 32;
	public static final byte ACCOUNT_ModifyPassword = 50;
	public static final byte ACCOUNT_ModifyPasswordOk = 51;
	public static final byte ACCOUNT_FindPassword = 52;
	public static final byte ACCOUNT_FindPasswordOk = 53;
	public static final byte ACCOUNT_ModifyPasswordFail = 56;
	public static final byte ACCOUNT_Verification = 57;
	public static final byte ACCOUNT_VerificationResult = 58;
	public static final byte ACCOUNT_SetNewToken = 59;
	public static final byte ACCOUNT_SetNewTokenOk = 60;
	public static final byte ACCOUNT_GetPushList = 61;
	public static final byte ACCOUNT_GetPushListOk = 62;
	public static final byte ACCOUNT_GetDownloadRewardList = 63;
	public static final byte ACCOUNT_GetDownloadRewardListOK = 64;

	/** 聊天相关协议 */
	public static final byte MAIN_CHAT = 3;
	public static final byte CHAT_SendMessage = 1;
	public static final byte CHAT_ReceiveMessage = 2;
	public static final byte CHAT_ChangeChannel = 3;
	public static final byte CHAT_SyncChannels = 4;
	public static final byte CHAT_GetSpeakerNum = 5;
	public static final byte CHAT_GetSpeakerNumOk = 6;
	
	/** 系统间通信协议 */
	public static final byte MAIN_SYSTEM = 4;
	public static final byte SYSTEM_NOP = 1;
	public static final byte SYSTEM_SYNC = 2;
	public static final byte SYSTEM_HttpClose = 3;
	public static final byte SYSTEM_ShakeHands = 4;// 客户端对dis心跳
	public static final byte SYSTEM_TopHands = 5;
	public static final byte SYSTEM_GetIslandState = 7;
	public static final byte SYSTEM_GetIslandStateOk = 8;
	public static final byte SYSTEM_GetSystemInfo = 9;
	public static final byte SYSTEM_GetSystemInfoOk = 10;
	public static final byte SYSTEM_GetNoviceRemark = 11;
	public static final byte SYSTEM_GetNoviceRemarkOk = 12;
	public static final byte SYSTEM_GetItemPriceAndVip = 13;
	public static final byte SYSTEM_GetItemPriceAndVipOk = 14;
	public static final byte SYSTEM_EarthPush = 15;
	public static final byte SYSTEM_BattleShakeHands = 16;
	public static final byte SYSTEM_GetPayAppRewardList = 17;
	public static final byte SYSTEM_GetPayAppRewardListOk = 18;
	public static final byte SYSTEM_GetPayAppReward = 19;
	public static final byte SYSTEM_GetPayAppRewardOk = 20;
	public static final byte SYSTEM_GetKeyProcess = 21;
	public static final byte SYSTEM_GetKeyProcessOk = 22;

	/** 公告协议 */
	public static final byte MAIN_BULLETIN = 11;
	public static final byte BULLETIN_GetBulletin = 1;
	public static final byte BULLETIN_GetBulletinOk = 2;
	public static final byte BULLETIN_GetAbout = 3;
	public static final byte BULLETIN_GetAboutOk = 4;
	public static final byte BULLETIN_GetHelp = 5;
	public static final byte BULLETIN_GetHelpOk = 6;
	public static final byte BULLETIN_GetWeiboInfo = 7;
	public static final byte BULLETIN_GetWeiboInfoOk = 8;
	public static final byte BULLETIN_WeiboShare = 9;
	/** 地图协议 */
	public static final byte MAIN_MAP = 15;
	public static final byte MAP_GetMapList = 1;
	public static final byte MAP_GetMapListOk = 2;

	/** 副本房间相关协议 */
	public static final byte MAIN_BOSSMAPROOM = 18;
	public static final byte BOSSMAPROOM_CreateRoom = 1;
	public static final byte BOSSMAPROOM_CreateRoomOk = 2;
	public static final byte BOSSMAPROOM_GetRoomList = 3;
	public static final byte BOSSMAPROOM_GetRoomListOk = 4;
	public static final byte BOSSMAPROOM_EnterRoom = 5;
	public static final byte BOSSMAPROOM_EnterRoomOk = 6;
	public static final byte BOSSMAPROOM_QuitRoom = 7;
	public static final byte BOSSMAPROOM_QuitRoomOk = 8;
	public static final byte BOSSMAPROOM_PlayerEnter = 9;
	public static final byte BOSSMAPROOM_PlayerQuit = 10;
	public static final byte BOSSMAPROOM_UpdateSeat = 11;
	public static final byte BOSSMAPROOM_UpdateRoom = 12;
	public static final byte BOSSMAPROOM_QuickGame = 13;
	public static final byte BOSSMAPROOM_SelectRoom = 14;
	public static final byte BOSSMAPROOM_SelectRoomOk = 15;
	public static final byte BOSSMAPROOM_GameReady = 16;
	public static final byte BOSSMAPROOM_GameReadyOk = 17;
	public static final byte BOSSMAPROOM_GetBossMapList = 18;
	public static final byte BOSSMAPROOM_SendBossMapList = 19;
	public static final byte BOSSMAPROOM_GetRoomInfo = 20;
	public static final byte BOSSMAPROOM_SendRoomInfo = 21;
	public static final byte BOSSMAPROOM_Invite = 22;
	public static final byte BOSSMAPROOM_BeInvite = 23;
	public static final byte BOSSMAPROOM_MakePair = 24;
	public static final byte BOSSMAPROOM_MakePairOk = 25;
	public static final byte BOSSMAPROOM_MakePairFail = 26;
	public static final byte BOSSMAPROOM_GetBossList = 27;
	public static final byte BOSSMAPROOM_SendBossList = 28;
	public static final byte BOSSMAPROOM_GetBossmapItems = 31;
	public static final byte BOSSMAPROOM_SendBossmapItems = 32;
	/** 任务相关协议（客户端共享） */
	public static final byte MAIN_TASK = 20;
	public static final byte TASK_GetTaskList = 1;
	public static final byte TASK_SendTaskList = 2;
	public static final byte TASK_StatusChanged = 3;
	public static final byte TASK_CommitTask = 4;
	public static final byte TASK_CommitTaskOk = 5;
	public static final byte TASK_GetCommitTaskNum = 8;
	public static final byte TASK_TiroTask = 9;
	public static final byte TASK_TiroTaskOk = 10;
	public static final byte TASK_TiroFlish = 11;
	public static final byte TASK_GetEverydayRewardList = 14;
	public static final byte TASK_SendEverydayRewardList = 15;
	public static final byte TASK_ReceiveReward = 16;
	public static final byte TASK_ReceiveRewardOk = 17;
	public static final byte TASK_GetSignInList = 18;
	public static final byte TASK_SendSignInList = 19;
	public static final byte TASK_SendWeiBo = 20;
	public static final byte TASK_AttendanceGetReward = 21;
	public static final byte TASK_AttendanceGetRewardOk = 22;
	public static final byte TASK_Sign = 23;
	public static final byte TASK_SupplSign = 27;
	public static final byte TASK_SupplSignOk = 28;
	public static final byte TASK_TiroStep = 26;
	public static final byte TASK_DiamondCompletion = 29;
	public static final byte TASK_GetActiveTaskList = 30;
	public static final byte TASK_SendActiveTaskList = 31;
	public static final byte TASK_GetActiveReward = 32;
	public static final byte TASK_GetActiveRewardOk = 33;
	public static final byte TASK_QuickUpExp = 34;
	public static final byte TASK_QuickUpExpOk = 35;
	public static final byte TASK_GetDoEveryDayList = 36;
	public static final byte TASK_GetDoEveryDayListOk = 37;
	public static final byte TASK_GetStrongerList = 38;
	public static final byte TASK_GetStrongerListOk = 39;
	public static final byte TASK_GetLevelRewardList = 40;
	public static final byte TASK_GetLevelRewardListOk = 41;
	public static final byte TASK_GetOnileRewardList = 42;
	public static final byte TASK_GetOnileRewardListOk = 43;
	public static final byte TASK_GetRewardNum = 44;
	/** 弹弹岛玩家物品相关协议 */
	public static final byte MAIN_PLAYER = 21;
	public static final byte PLAYER_GetPlayerInfo = 1;
	public static final byte PLAYER_GetPlayerInfoOk = 2;
	public static final byte PLAYER_GetSkillList = 7;
	public static final byte PLAYER_GetSkillListOk = 8;
	public static final byte PLAYER_GetPropList = 9;
	public static final byte PLAYER_GetPropListOk = 10;
	public static final byte PLAYER_GetPlayerSkill = 11;
	public static final byte PLAYER_GetPlayerSkillOk = 12;
	public static final byte PLAYER_GetPlayerProp = 13;
	public static final byte PLAYER_GetPlayerPropOk = 14;
	public static final byte PLAYER_ChangeSkill = 15;
	public static final byte PLAYER_ChangeSkillOk = 16;
	public static final byte PLAYER_ChangeProp = 17;
	public static final byte PLAYER_ChangePropOk = 18;
	public static final byte PLAYER_SendOnlinePlayer = 21;

	// 玩家排行榜相关协议
	public static final byte PLAYER_GetTopRecord = 30;
	public static final byte PLAYER_GetTopRecordOk = 31;
	public static final byte PLAYER_Rename = 35;
	public static final byte PLAYER_RenameOk = 36;
	// 获取玩家的BUFF列表
	public static final byte PLAYER_GetBuffList = 37;
	public static final byte PLAYER_GetBuffListOk = 38;
	public static final byte PLAYER_GetStrengthenInfo = 39;
	public static final byte PLAYER_GetStrengthenInfoOk = 40;
	public static final byte PLAYER_GetOnlinePlayer = 42;
	public static final byte PLAYER_GetAttribute = 43;
	public static final byte PLAYER_GetAttributeOk = 44;
	public static final byte PLAYER_SetPlayerWeiboId = 45;
	public static final byte PLAYER_NoviceSteps = 46;
	public static final byte PLAYER_UpdatePlayerAttribute = 47;
	public static final byte PLAYER_UpdatePlayerLevel = 48;
	public static final byte PLAYER_ChangeEquipment = 51;
	public static final byte PLAYER_PlayerButtonInfo = 52;

	// 头像上传
	public static final byte PLAYER_PictureUploadFirst = 58;
	public static final byte PLAYER_PictureUploadOk = 59;
	// 头像保存
	public static final byte PLAYER_PictureUploadSave = 60;
	// 头像删除
	public static final byte PLAYER_PictureUploadDelete = 61;
	public static final byte PLAYER_PictureUploadDeleteOk = 62;
	public static final byte PLAYER_PictureUploadSaveOk = 63;
	// 充值暴击
	public static final byte PLAYER_RechargeCritResultOk = 64;
	// 新手教程时使用的装扮
	public static final byte PLAYER_GetPlayerInfoNovice = 65;
	public static final byte PLAYER_GetPlayerInfoNoviceOk = 66;

	/** 称号相关协议（客户端共享） */
	public static final byte MAIN_TITLE = 22;
	public static final byte TITLE_GetTitleList = 1;
	public static final byte TITLE_GetTitleListOk = 2;
	public static final byte TITLE_PlayerGetTitle = 3;
	public static final byte TITLE_SetTitle = 4;
	public static final byte TITLE_SetTitleOk = 5;
	/** 弹弹岛好友相关协议 **/
	public static final byte MAIN_FRIEND = 27;
	public static final byte FRIEND_SendFriendList = 2;
	public static final byte FRIEND_AddFriendOk = 4;
	public static final byte FRIEND_SetPrivateChat = 5;
	public static final byte FRIEND_SetPrivateChatOk = 6;
	public static final byte FRIEND_SetBlackListOk = 8;
	public static final byte FRIEND_DeleteFriendOk = 10;
	public static final byte FRIEND_SendCommunityFriendList = 14;
	public static final byte FRIEND_SendBlackList = 16;
	public static final byte FRIEND_SearchFriend = 17;
	public static final byte FRIEND_SearchFriendOk = 18;
	public static final byte FRIEND_GetFriendList = 19;
	public static final byte FRIEND_AddFriend = 20;
	public static final byte FRIEND_SetBlackList = 21;
	public static final byte FRIEND_DeleteFriend = 22;
	public static final byte FRIEND_GetCommunityFriendList = 23;
	public static final byte FRIEND_GetBlackList = 24;

	/** 弹弹岛附近好友相关协议 **/
	public static final byte MAIN_NEARBY = 28;
	public static final byte NEARBY_GetNearbyFriendList = 1;
	public static final byte NEARBY_GetNearbyFriendListOk = 2;
	public static final byte NEARBY_GetNearbyPlayerList = 3;
	public static final byte NEARBY_GetNearbyPlayerListOk = 4;
	public static final byte NEARBY_AddNearbyFriend = 5;
	public static final byte NEARBY_AddNearbyFriendOk = 6;
	public static final byte NEARBY_RemoveNearbyFriend = 7;
	public static final byte NEARBY_RemoveNearbyFriendOk = 8;
	public static final byte NEARBY_GetNearbyReceivedMailList = 9;
	public static final byte NEARBY_GetNearbyReceivedMailListOk = 10;
	public static final byte NEARBY_GetNearbySendMailList = 11;
	public static final byte NEARBY_GetNearbySendMailListOk = 12;
	public static final byte NEARBY_GetNearbyMailContent = 13;
	public static final byte NEARBY_GetNearbyMailContentOk = 14;
	public static final byte NEARBY_DeleteNearbyMail = 15;
	public static final byte NEARBY_DeleteNearbyMailOk = 16;
	public static final byte NEARBY_UpdatePlayerLocationInfo = 17;
	public static final byte NEARBY_UpdatePlayerInfo = 18;
	public static final byte NEARBY_UpdatePlayerInfoOk = 19;
	public static final byte NEARBY_PlayerOnline = 20;
	public static final byte NEARBY_PlayerOffline = 21;
	public static final byte NEARBY_SendNearbyMail = 22;
	public static final byte NEARBY_SendNearbyMailOk = 23;
	public static final byte NEARBY_GetNearbyMailCount = 24;
	public static final byte NEARBY_SendNearbyMailCount = 25;

	/** 弹弹岛公会相关协议 */
	public static final byte MAIN_COMMUNITY = 32;
	public static final byte COMMUNITY_SendCommunityList = 2;
	public static final byte COMMUNITY_CreateCommunity = 3;
	public static final byte COMMUNITY_SearchNotFound = 4;
	public static final byte COMMUNITY_SearchCommunity = 5;
	public static final byte COMMUNITY_GetCommunityInfo = 6;
	public static final byte COMMUNITY_GetCommunityInfoOk = 7;
	public static final byte COMMUNITY_EnterCommunity = 8;
	public static final byte COMMUNITY_EnterCommunityOk = 9;
	public static final byte COMMUNITY_SendCommunityMemberList = 11;
	public static final byte COMMUNITY_GetApprovingMemberList = 12;
	public static final byte COMMUNITY_SendApprovingMemberList = 13;
	public static final byte COMMUNITY_ApproveMember = 14;
	public static final byte COMMUNITY_ApproveMemberOk = 15;
	public static final byte COMMUNITY_AcceptMemberOr = 16;
	public static final byte COMMUNITY_AcceptMemberOrOk = 17;
	public static final byte COMMUNITY_InviteMember = 18;
	public static final byte COMMUNITY_InviteMemberOk = 19;
	public static final byte COMMUNITY_ModifyDeclaration = 20;
	public static final byte COMMUNITY_ModifyDeclarationOk = 21;
	public static final byte COMMUNITY_ModifyNotice = 22;
	public static final byte COMMUNITY_ModifyNoticeOk = 23;
	public static final byte COMMUNITY_ChangePresident = 24;
	public static final byte COMMUNITY_ChangePresidentOk = 25;
	public static final byte COMMUNITY_ExitCommunity = 26;
	public static final byte COMMUNITY_ExitCommunityOk = 27;
	public static final byte COMMUNITY_DismissCommunity = 28;
	public static final byte COMMUNITY_DismissCommunityOk = 29;
	public static final byte COMMUNITY_ApplyJoinCommunity = 30;
	public static final byte COMMUNITY_ApplyJoinCommunityOk = 31;
	public static final byte COMMUNITY_CreateCommunityOk = 32;
	public static final byte COMMUNITY_ChangePosition = 33;
	public static final byte COMMUNITY_ChangePositionOk = 34;
	public static final byte COMMUNITY_FiredMemberOk = 36;
	public static final byte COMMUNITY_SendGroupMail = 37;
	public static final byte COMMUNITY_SendGroupMailOk = 38;
	public static final byte COMMUNITY_CheckRight = 39;
	public static final byte COMMUNITY_CheckRightFailed = 40;
	public static final byte COMMUNITY_CheckRightOk = 41;
	public static final byte COMMUNITY_Rename = 43;
	public static final byte COMMUNITY_RenameOk = 44;
	public static final byte COMMUNITY_Upgrade = 45;
	public static final byte COMMUNITY_UpgradeOk = 46;
	public static final byte COMMUNITY_GetSkill = 47;
	public static final byte COMMUNITY_GetSkillOk = 48;
	public static final byte COMMUNITY_GetSkillInfo = 49;
	public static final byte COMMUNITY_GetSkillInfoOk = 50;
	public static final byte COMMUNITY_UseSkill = 51;
	public static final byte COMMUNITY_UseSkillOk = 52;
	public static final byte COMMUNITY_GetUsedSkill = 53;
	public static final byte COMMUNITY_GetUsedSkillOk = 54;
	public static final byte COMMUNITY_GetCommunityList = 55;
	public static final byte COMMUNITY_GetCommunityMemberList = 56;
	public static final byte COMMUNITY_FiredMember = 57;
	public static final byte COMMUNITY_GetSituationList = 59;
	public static final byte COMMUNITY_SendSituationList = 60;
	public static final byte COMMUNITY_GetSituation = 61;
	public static final byte COMMUNITY_SendSituation = 62;
	public static final byte COMMUNITY_CommunitySetEnemy = 63;
	public static final byte COMMUNITY_CommunitySetEnemyOk = 64;
	public static final byte COMMUNITY_BuySkill = 65;
	public static final byte COMMUNITY_BuySkillOk = 66;
	/** 弹弹岛邮件相关协议 */
	public static final byte MAIN_MAIL = 38;
	public static final byte MAIL_SendInboxMail = 2;
	public static final byte MAIL_GetMailContent = 3;
	public static final byte MAIL_SendMailContent = 4;
	public static final byte MAIL_SendMail = 5;
	public static final byte MAIL_SendMailOk = 6;
	public static final byte MAIL_DeleteMail = 7;
	public static final byte MAIL_DeleteMailOk = 8;
	public static final byte MAIL_SendOutboxMail = 10;
	public static final byte MAIL_HasNewMail = 11;
	public static final byte MAIL_LoginCheckMail = 12;
	public static final byte MAIL_LoginCheckMailOk = 13;
	public static final byte MAIL_GetInboxMailNew = 14;
	public static final byte MAIL_GetOutboxMailNew = 15;
	/** 弹弹岛VIP相关协议 */
	public static final byte MAIN_VIP = 52;
	public static final byte VIP_ReceiveGiftBag = 1;
	public static final byte VIP_ReceiveGiftBagOk = 2;
	public static final byte VIP_GetVipInfo = 3;
	public static final byte VIP_GetVipInfoOK = 4;
	public static final byte VIP_GetVipRewardList = 5;
	public static final byte VIP_GetVipRewardListOk = 6;
	public static final byte VIP_GetVipPrivilegeInfo = 7;
	public static final byte VIP_GetVipPrivilegeInfoOk = 8;
	public static final byte VIP_GetVipLevelAward = 9;
	public static final byte VIP_GetVipLevelAwardOK = 10;
	public static final byte VIP_VipReceiveInfo = 11;

	/** 房间相关协议 */
	public static final byte MAIN_ROOM = 60;
	public static final byte ROOM_CreateRoom = 1;
	public static final byte ROOM_CreateRoomOk = 2;
	public static final byte ROOM_GetRoomList = 3;
	public static final byte ROOM_GetRoomListOk = 4;
	public static final byte ROOM_EnterRoom = 5;
	public static final byte ROOM_EnterRoomOk = 6;
	public static final byte ROOM_QuitRoom = 7;
	public static final byte ROOM_QuitRoomOk = 8;
	public static final byte ROOM_PlayerEnter = 9;
	public static final byte ROOM_PlayerQuit = 10;
	public static final byte ROOM_UpdateSeat = 11;
	public static final byte ROOM_UpdateRoom = 12;
	public static final byte ROOM_QuickGame = 13;
	public static final byte ROOM_SelectRoom = 14;
	public static final byte ROOM_SelectRoomOk = 15;
	public static final byte ROOM_GameReady = 16;
	public static final byte ROOM_GameReadyOk = 17;
	public static final byte ROOM_MakePair = 18;
	public static final byte ROOM_MakePairOk = 19;
	public static final byte ROOM_MakePairFail = 20;
	public static final byte ROOM_Invite = 21;
	public static final byte ROOM_BeInvite = 22;
	public static final byte ROOM_SoundRoom = 23;
	/** 弹弹岛商城相关协议 */
	public static final byte MAIN_TRATE = 61;
	public static final byte TRATE_BuyItems = 3;
	public static final byte TRATE_BuyResult = 4;
	public static final byte TRATE_ExchangeItem = 5;
	public static final byte TRATE_ExchangeOk = 6;
	public static final byte TRATE_GetPromotShopListOk = 8;
	public static final byte TRATE_BuyPromotItems = 9;
	public static final byte TRATE_BuyPromotResult = 10;
	public static final byte TRATE_GetItemPrice = 11;
	public static final byte TRATE_GetItemPriceOk = 12;
	public static final byte TRATE_GetPromotShopList = 14;
	public static final byte TRATE_GetLimitedItemPrice = 15;
	public static final byte TRATE_GetLimitedItemPriceOk = 16;
	public static final byte TRATE_BuyLimitedItem = 17;
	public static final byte TRATE_BuyLimitedItemOk = 18;
	/** 兑换（新） */
	public static final byte MAIN_EXCHANGE = 62;
	public static final byte EXCHANGE_RequestItemList = 1;
	public static final byte EXCHANGE_ResponseItemList = 2;
	public static final byte EXCHANGE_RequestExchange = 3;
	public static final byte EXCHANGE_ResponseExchange = 4;
	public static final byte EXCHANGE_RequestRefresh = 5;
	public static final byte EXCHANGE_ResponseRefresh = 6;

	/** 弹弹岛跨服对战相关协议 */
	public static final byte MAIN_CROSS = 65;
	public static final byte CROSS_CrossPair = 1;
	public static final byte CROSS_CrossPairFail = 2;
	public static final byte CROSS_CrossPairOk = 3;
	public static final byte CROSS_CrossSendPlayerInfo = 4;
	public static final byte CROSS_CrossSynPlayerInfo = 5;
	public static final byte CROSS_CrossStartLoading = 6;
	public static final byte CROSS_CrossAIControlCommon = 7;
	public static final byte CROSS_CrossPositionsInMap = 8;
	public static final byte CROSS_CrossPostionsForPlayers = 9;
	public static final byte CROSS_CrossGetAttackSequence = 10;
	public static final byte CROSS_CrossAttackSequence = 11;
	public static final byte CROSS_CrossFinishLoading = 12;
	public static final byte CROSS_CrossGotoBattle = 13;
	public static final byte CROSS_CrossStartNewTimer = 14;
	public static final byte CROSS_CrossEndCurRound = 15;
	public static final byte CROSS_CrossCanStartCurRound = 16;
	public static final byte CROSS_CrossPlayerMove = 17;
	public static final byte CROSS_CrossOtherPlayerMove = 18;
	public static final byte CROSS_CrossSkillEquip = 19;
	public static final byte CROSS_CrossOtherSkillEquip = 20;
	public static final byte CROSS_CrossBigSkill = 21;
	public static final byte CROSS_CrossOtherBigSkill = 22;
	public static final byte CROSS_CrossShoot = 23;
	public static final byte CROSS_CrossOtherShoot = 24;
	public static final byte CROSS_CrossHurt = 25;
	public static final byte CROSS_CrossUpdateHP = 26;
	public static final byte CROSS_CrossFly = 27;
	public static final byte CROSS_CrossOtherFly = 28;
	public static final byte CROSS_CrossPass = 29;
	public static final byte CROSS_CrossOtherPass = 30;
	public static final byte CROSS_CrossRebornPosition = 31;
	public static final byte CROSS_CrossPlayerReborn = 32;
	public static final byte CROSS_CrossQuitBattle = 33;
	public static final byte CROSS_CrossQuitBattleOk = 34;
	public static final byte CROSS_CrossLoadingPercent = 35;
	public static final byte CROSS_CrossOtherLoadingPercent = 36;
	public static final byte CROSS_CrossUsingFace = 37;
	public static final byte CROSS_CrossOtherUsingFace = 38;
	public static final byte CROSS_CrossUseFly = 39;
	public static final byte CROSS_CrossOtherUseFly = 40;
	public static final byte CROSS_CrossOutOfScene = 41;
	public static final byte CROSS_CrossBeFrozen = 42;
	public static final byte CROSS_CrossFrozenOver = 43;
	public static final byte CROSS_CrossChangeAngryValue = 44;
	public static final byte CROSS_CrossSomeOneDead = 45;
	public static final byte CROSS_CrossUpdateMedal = 46;
	public static final byte CROSS_CrossGameOver = 47;
	public static final byte CROSS_CrossPlayerLose = 48;
	public static final byte CROSS_CrossChat = 49;
	public static final byte CROSS_CrossSendMessage = 50;
	public static final byte CROSS_CrossCheckInfo = 51;
	public static final byte CROSS_CrossSendInfo = 52;
	public static final byte CROSS_CrossKillLine = 57;
	public static final byte CROSS_CrossShakeHands = 58;
	public static final byte CROSS_CrossPlayerInfo = 61;
	public static final byte CROSS_CrossPlayerInfoOk = 62;

	/** 弹弹岛战斗相关协议 */
	public static final byte MAIN_BATTLE = 70;
	public static final byte BATTLE_AIControlCommon = 1;
	public static final byte BATTLE_StartLoading = 3;
	public static final byte BATTLE_PositionsInMap = 4;
	public static final byte BATTLE_PostionsForPlayers = 5;
	public static final byte BATTLE_GetAttackSequence = 6;
	public static final byte BATTLE_AttackSequence = 7;
	public static final byte BATTLE_FinishLoading = 8;
	public static final byte BATTLE_GotoBattle = 9;
	public static final byte BATTLE_StartNewTimer = 10;
	public static final byte BATTLE_EndCurRound = 11;
	public static final byte BATTLE_CanStartCurRound = 12;
	public static final byte BATTLE_PlayerMove = 13;
	public static final byte BATTLE_OtherPlayerMove = 14;
	public static final byte BATTLE_SkillEquip = 15;
	public static final byte BATTLE_OtherSkillEquip = 16;
	public static final byte BATTLE_ChangeAngryValue = 17;
	public static final byte BATTLE_BigSkill = 18;
	public static final byte BATTLE_OtherBigSkill = 19;
	public static final byte BATTLE_Shoot = 20;
	public static final byte BATTLE_OtherShoot = 21;
	public static final byte BATTLE_Hurt = 22;
	public static final byte BATTLE_Fly = 23;
	public static final byte BATTLE_OtherFly = 24;
	public static final byte BATTLE_Pass = 26;
	public static final byte BATTLE_GameOver = 27;
	public static final byte BATTLE_OtherPass = 28;
	public static final byte BATTLE_UpdateHP = 29;
	public static final byte BATTLE_SomeOneDead = 30;
	public static final byte BATTLE_BackToRoom = 31;
	public static final byte BATTLE_PlayerLose = 32;
	public static final byte BATTLE_ChooseCard = 34;
	public static final byte BATTLE_OhterChooseCard = 35;
	public static final byte BATTLE_OutOfScene = 36;
	public static final byte BATTLE_RebornPosition = 37;
	public static final byte BATTLE_PlayerReborn = 33;
	public static final byte BATTLE_UpdateMedal = 38;
	public static final byte BATTLE_QuitBattle = 39;
	public static final byte BATTLE_QuitBattleOk = 40;
	public static final byte BATTLE_LoadingPercent = 41;
	public static final byte BATTLE_OtherLoadingPercent = 42;
	public static final byte BATTLE_UsingFace = 43;
	public static final byte BATTLE_OtherUsingFace = 44;
	public static final byte BATTLE_UseFly = 45;
	public static final byte BATTLE_OtherUseFly = 46;
	public static final byte BATTLE_GetTips = 47;
	public static final byte BATTLE_GetTipsOk = 48;
	public static final byte BATTLE_ClearFailNum = 51;
	public static final byte BATTLE_ClearFailNumOk = 52;
	public static final byte BATTLE_BeFrozen = 53;
	public static final byte BATTLE_FrozenOver = 54;
	public static final byte BATTLE_SendPlayerBattleAttribute = 55;
	public static final byte BATTLE_GetEventInfo = 56;
	public static final byte BATTLE_GetEventInfoOk = 57;
	public static final byte BATTLE_EventContact = 58;
	public static final byte BATTLE_OtherEventContact = 59;
	/** 副本战斗相关协议 */
	public static final byte MAIN_BOSSMAPBATTLE = 71;
	public static final byte BOSSMAPBATTLE_AIControlCommon = 1;
	public static final byte BOSSMAPBATTLE_StartLoading = 3;
	public static final byte BOSSMAPBATTLE_FinishLoading = 8;
	public static final byte BOSSMAPBATTLE_GotoBattle = 9;
	public static final byte BOSSMAPBATTLE_EndCurRound = 11;
	public static final byte BOSSMAPBATTLE_CanStartCurRound = 12;
	public static final byte BOSSMAPBATTLE_PlayerMove = 13;
	public static final byte BOSSMAPBATTLE_OtherPlayerMove = 14;
	public static final byte BOSSMAPBATTLE_SkillEquip = 15;
	public static final byte BOSSMAPBATTLE_OtherSkillEquip = 16;
	public static final byte BOSSMAPBATTLE_ChangeAngryValue = 17;
	public static final byte BOSSMAPBATTLE_BigSkill = 18;
	public static final byte BOSSMAPBATTLE_OtherBigSkill = 19;
	public static final byte BOSSMAPBATTLE_Shoot = 20;
	public static final byte BOSSMAPBATTLE_OtherShoot = 21;
	public static final byte BOSSMAPBATTLE_Hurt = 22;
	public static final byte BOSSMAPBATTLE_Fly = 23;
	public static final byte BOSSMAPBATTLE_OtherFly = 24;
	public static final byte BOSSMAPBATTLE_Pass = 26;
	public static final byte BOSSMAPBATTLE_GameOver = 27;
	public static final byte BOSSMAPBATTLE_OtherPass = 28;
	public static final byte BOSSMAPBATTLE_UpdateHP = 29;
	public static final byte BOSSMAPBATTLE_SomeOneDead = 30;
	public static final byte BOSSMAPBATTLE_BackToRoom = 31;
	public static final byte BOSSMAPBATTLE_PlayerLose = 32;
	public static final byte BOSSMAPBATTLE_OutOfScene = 36;
	public static final byte BOSSMAPBATTLE_RebornPosition = 37;
	public static final byte BOSSMAPBATTLE_PlayerReborn = 33;
	public static final byte BOSSMAPBATTLE_UpdateMedal = 38;
	public static final byte BOSSMAPBATTLE_QuitBattle = 39;
	public static final byte BOSSMAPBATTLE_QuitBattleOk = 40;
	public static final byte BOSSMAPBATTLE_LoadingPercent = 41;
	public static final byte BOSSMAPBATTLE_OtherLoadingPercent = 42;
	public static final byte BOSSMAPBATTLE_UsingFace = 43;
	public static final byte BOSSMAPBATTLE_OtherUsingFace = 44;
	public static final byte BOSSMAPBATTLE_UseFly = 45;
	public static final byte BOSSMAPBATTLE_OtherUseFly = 46;
	public static final byte BOSSMAPBATTLE_NearAttack = 47;
	public static final byte BOSSMAPBATTLE_OtherNearAttack = 48;
	public static final byte BOSSMAPBATTLE_BuildGuai = 49;
	public static final byte BOSSMAPBATTLE_BossOtherMapBuildGuai = 50;
	public static final byte BOSSMAPBATTLE_RequestGuaiBattleId = 51;
	public static final byte BOSSMAPBATTLE_RequestGuaiBattleIdOk = 52;
	public static final byte BOSSMAPBATTLE_BossChange = 53;
	public static final byte BOSSMAPBATTLE_OtherChange = 54;
	public static final byte BOSSMAPBATTLE_Reward = 55;
	public static final byte BOSSMAPBATTLE_RewardOk = 56;
	public static final byte BOSSMAPBATTLE_OtherRewardOk = 57;
	public static final byte BOSSMAPBATTLE_ChangePosition = 59;
	public static final byte BOSSMAPBATTLE_OtherChangePosition = 60;
	public static final byte BOSSMAPBATTLE_KillGuai = 61;
	public static final byte BOSSMAPBATTLE_SendPlayerBattleAttribute = 62;
	public static final byte BOSSMAPBATTLE_GetTreasureInfo = 63;
	public static final byte BOSSMAPBATTLE_GetTreasureInfoOk = 64;
	public static final byte BOSSMAPBATTLE_TreasureContact = 65;
	public static final byte BOSSMAPBATTLE_OtherTreasureContact = 66;
	public static final byte BOSSMAPBATTLE_RequestSynchroClients = 67;
	public static final byte BOSSMAPBATTLE_SenSynchroClients = 68;
	/** 客户端日志上传控制 */
	public static final byte MAIN_ERRORLOG = 72;
	public static final byte ERRORLOG_GetLogList = 1;
	public static final byte ERRORLOG_SendLogList = 2;
	public static final byte ERRORLOG_GetLog = 3;
	public static final byte ERRORLOG_SendLog = 4;
	/** 系统提示(包含错误提示和获取安卓充值价格列表信息) */
	public static final byte MAIN_ERRORCODE = 73;
	public static final byte ERRORCODE_GetList = 1;
	public static final byte ERRORCODE_GetListOk = 2;
	public static final byte ERRORCODE_CheckList = 3;
	public static final byte ERRORCODE_CheckOk = 4;
	public static final byte ERRORCODE_GetSmsCodeList = 12;
	public static final byte ERRORCODE_GetSmsCodeListOk = 13;
	public static final byte ERRORCODE_GetSmsCodeNewList = 14;
	public static final byte ERRORCODE_GetSmsCodeNewListOk = 15;

	/** 弹弹岛充值相关协议 */
	public static final byte MAIN_PURCHASE = 74;
	public static final byte PURCHASE_GetProductIdList = 1;
	public static final byte PURCHASE_SendProductIdList = 2;
	public static final byte PURCHASE_IOSSendProductCheckInfo = 3;
	public static final byte PURCHASE_BuySuccess = 4;
	public static final byte PURCHASE_BuyFailed = 5;
	public static final byte PURCHASE_AndroidSendProductCheckInfo = 6;
	public static final byte PURCHASE_SendProductId = 7;
	public static final byte PURCHASE_GetRuleList = 8;
	public static final byte PURCHASE_GetRuleListOk = 9;
	public static final byte PURCHASE_GetCallBackUri = 10;
	public static final byte PURCHASE_GetCallBackUriOk = 11;
	public static final byte PURCHASE_RequestSmsCodeSerialid = 14;
	public static final byte PURCHASE_RequestSmsCodeSerialidOk = 15;
	public static final byte PURCHASE_SubmitSMSProduct = 16;
	public static final byte PURCHASE_SMSProductBuySuccess = 17;
	/** 排位赛相关协议 */
	public static final byte MAIN_QUALIFYING = 77;
	public static final byte QUALIFYING_EnterRoom = 1;
	public static final byte QUALIFYING_EnterRoomOk = 2;
	public static final byte QUALIFYING_Start = 3;
	public static final byte QUALIFYING_Exit = 5;
	public static final byte QUALIFYING_Detail = 6;
	public static final byte QUALIFYING_DetailOk = 7;

	/** 合成强化主协议 */
	public static final byte MAIN_STRENGTHEN = 81;
	public static final byte STRENGTHEN_GetItemList = 1;
	public static final byte STRENGTHEN_GetItemListOk = 2;
	public static final byte STRENGTHEN_Merge = 3;
	public static final byte STRENGTHEN_MergeOk = 4;
	public static final byte STRENGTHEN_GetRateList = 5;
	public static final byte STRENGTHEN_GetRateListOk = 6;
	public static final byte STRENGTHEN_Purify = 7;
	public static final byte STRENGTHEN_PurifyOk = 8;
	public static final byte STRENGTHEN_ChangeAttribute = 9;
	public static final byte STRENGTHEN_ChangeAttributeOk = 10;
	public static final byte STRENGTHEN_GetSkillList = 11;
	public static final byte STRENGTHEN_SendSkillList = 12;
	public static final byte STRENGTHEN_LockSkill = 13;
	public static final byte STRENGTHEN_LockSkillOk = 14;
	public static final byte STRENGTHEN_Punch = 15;
	public static final byte STRENGTHEN_PunchOk = 16;
	public static final byte STRENGTHEN_Mosaic = 17;
	public static final byte STRENGTHEN_MosaicOk = 18;
	public static final byte STRENGTHEN_GetConsumeInfo = 19;
	public static final byte STRENGTHEN_GetConsumeInfoOk = 20;
	public static final byte STRENGTHEN_MergeScrap = 21;
	public static final byte STRENGTHEN_MergeScrapOK = 22;
	public static final byte STRENGTHEN_PurifyNew = 23;
	public static final byte STRENGTHEN_UnLockSkill = 24;
	public static final byte STRENGTHEN_UnLockSkillOk = 25;
	public static final byte STRENGTHEN_GuideMerge = 26;
	public static final byte STRENGTHEN_ChangeConfig = 27;
	public static final byte STRENGTHEN_ChangeConfigOk = 28;
	/** 兑换相关协议 */
	public static final byte MAIN_EXCHANGECODE = 82;
	public static final byte EXCHANGECODE_SendExchangeCode = 1;
	public static final byte EXCHANGECODE_SendExchangeCodeOk = 2;
	/** 许愿相关协议 */
	public static final byte MAIN_LOTTERY = 83;
	public static final byte LOTTERY_ReceiveReward = 1;
	public static final byte LOTTERY_ReceiveRewardOk = 2;
	public static final byte LOTTERY_ReceiveZflh = 3;
	public static final byte LOTTERY_ReceiveZflhOk = 4;
	/** 结婚相关协议 */
	public static final byte MAIN_WEDDING = 84;
	public static final byte WEDDING_GetMaritalStatus = 1;
	public static final byte WEDDING_GetMaritalStatusOK = 2;
	public static final byte WEDDING_GetMarryMailList = 3;
	public static final byte WEDDING_SendLoveLetter = 4;
	public static final byte WEDDING_SendLoveLetterOK = 5;
	public static final byte WEDDING_SendLoveLetterToCouple = 6;
	public static final byte WEDDING_GetLoveLetterInfo = 7;
	public static final byte WEDDING_ChangeMarryStatus = 8;
	public static final byte WEDDING_SendMarryStatusToCouple = 9;
	public static final byte WEDDING_RemoveEngagement = 10;
	public static final byte WEDDING_RemoveEngagementToCouple = 11;
	public static final byte WEDDING_GiveDiamond = 12;
	public static final byte WEDDING_GiveDiamondOK = 13;
	public static final byte WEDDING_ChangeMarryStatusOK = 14;
	public static final byte WEDDING_RemoveEngagementOK = 15;
	public static final byte WEDDING_GetWedList = 16;
	public static final byte WEDDING_SendWedList = 17;
	public static final byte WEDDING_GetPeopleInfo = 18;
	public static final byte WEDDING_SendPeopleInfo = 19;
	public static final byte WEDDING_GetCanWedTime = 20;
	public static final byte WEDDING_SendCanWedTime = 21;
	public static final byte WEDDING_JoinWedding = 22;
	public static final byte WEDDING_JoinWeddingOk = 23;
	public static final byte WEDDING_ExtWedding = 24;
	public static final byte WEDDING_ExtWeddingOk = 25;
	public static final byte WEDDING_GetJoinList = 26;
	public static final byte WEDDING_SendJoinList = 27;
	public static final byte WEDDING_GiveReward = 28;
	public static final byte WEDDING_GiveRewardOk = 29;
	public static final byte WEDDING_PeopleGetReward = 30;
	public static final byte WEDDING_PeopleGetRewardOk = 31;
	public static final byte WEDDING_Blessing = 32;
	public static final byte WEDDING_BlessingOk = 33;
	public static final byte WEDDING_WeddingOver = 34;
	public static final byte WEDDING_PlayerHaveBless = 35;
	public static final byte WEDDING_RefreshWedding = 36;
	public static final byte WEDDING_SetPassword = 37;
	public static final byte WEDDING_SetPasswordOk = 38;
	public static final byte WEDDING_PleaseOut = 39;
	public static final byte WEDDING_PleaseOutOk = 40;

	/** 首冲奖励、抽奖相关协议 */
	public static final byte MAIN_REWARD = 87;
	public static final byte REWARD_GetRewardList = 1;
	public static final byte REWARD_GetRewardListOk = 2;
	public static final byte REWARD_GetReward = 3;
	public static final byte REWARD_GetRewardOk = 4;
	/** 基金相关协议 */
	public static final byte MAIN_FUND = 88;
	public static final byte FUND_GetFundInfo = 1;
	public static final byte FUND_GetFundInfoOk = 2;
	public static final byte FUND_BuyFund = 3;
	public static final byte FUND_BuyFundOk = 4;
	public static final byte FUND_Receive = 5;
	public static final byte FUND_ReceiveOk = 6;
	public static final byte FUND_GetFundList = 7;
	public static final byte FUND_GetFundListOk = 8;
	public static final byte FUND_GetFundDetail = 9;
	public static final byte FUND_GetFundDetailOk = 10;
	/** 基金相关协议 */
	public static final byte MAIN_INVITE = 89;
	public static final byte INVITE_GetInviteInfo = 1;
	public static final byte INVITE_GetInviteInfoOk = 2;
	public static final byte INVITE_GetInviteList = 3;
	public static final byte INVITE_GetInviteListOk = 4;
	public static final byte INVITE_GetInviteReward = 5;
	public static final byte INVITE_GetInviteRewardOk = 6;
	public static final byte INVITE_BindInvite = 7;
	public static final byte INVITE_BindInviteResult = 8;
	/** 礼包相关协议 */
	public static final byte MAIN_SPREE = 90;
	public static final byte SPREE_GetGift = 1;
	public static final byte SPREE_GetGiftOk = 2;
	/** 活动广场相关协议 */
	public static final byte MAIN_SQUARE = 91;
	public static final byte SQUARE_GetInfo = 1;
	public static final byte SQUARE_SendInfo = 2;
	public static final byte SQUARE_GetMhUrl = 3;
	public static final byte SQUARE_GetMhUrlOk = 4;
	/** 转生相关协议 */
	public static final byte MAIN_REBIRTH = 92;
	public static final byte REBIRTH_GetRebirthInfo = 1;
	public static final byte REBIRTH_GetRebirthInfoOk = 2;
	public static final byte REBIRTH_Rebirth = 3;
	public static final byte REBIRTH_RebirthResult = 4;
	/** 装备升星相关协议 */
	public static final byte MAIN_STAR = 93;
	public static final byte STAR_Upgrade = 1;
	public static final byte STAR_UpgradeOk = 2;

	/** 物品回收相关协议 */
	public static final byte MAIN_RECYCLE = 94;
	public static final byte RECYCLE_RecycleItem = 1;
	public static final byte RECYCLE_RecycleItemOk = 2;

	/** 抽奖相关协议 */
	public static final byte MAIN_DRAW = 95;
	public static final byte DRAW_GetDrawTypeList = 1;
	public static final byte DRAW_SendDrawTypeList = 2;
	public static final byte DRAW_GetItemList = 3;
	public static final byte DRAW_SendItemList = 4;
	public static final byte DRAW_DrawRefresh = 5;
	public static final byte DRAW_GetReward = 6;
	public static final byte DRAW_Draw = 7;
	public static final byte DRAW_DrawOk = 8;

	/** 宠物相关协议 */
	public static final byte MAIN_PET = 96;
	public static final byte PET_GetTrainTimeLeft = 3;
	public static final byte PET_GetTrainTimeLeftOk = 4;
	public static final byte PET_StartTrain = 5;
	public static final byte PET_CompletionTraining = 6;
	public static final byte PET_GetAllPetList = 7;
	public static final byte PET_GetAllPetListOk = 8;
	public static final byte PET_Summon = 9;
	public static final byte PET_SummonOk = 10;
	public static final byte PET_RequestCulture = 11;
	public static final byte PET_ReceivePetCultureValue = 12;
	public static final byte PET_DetermineCulture = 13;
	public static final byte PET_GetInheritanceList = 14;
	public static final byte PET_GetInheritanceListOk = 15;
	public static final byte PET_Inheritance = 16;
	public static final byte PET_Played = 17;
	public static final byte PET_PlayedOk = 18;
	public static final byte PET_InheritanceOk = 19;
	public static final byte PET_RequestOpenBar = 21;
	public static final byte PET_OpenBarInfo = 22;
	public static final byte PET_OpenBar = 23;
	public static final byte PET_OpenBarOk = 24;
	public static final byte PET_GetIntroduce = 25;
	public static final byte PET_GetIntroduceOk = 26;
	public static final byte PET_GuideRequestCulture = 27;
	/** 世界BOSS相关协议 */
	public static final byte MAIN_WORLDBOSSHALL = 97;
	public static final byte WORLDBOSSHALL_GetOpenState = 1;
	public static final byte WORLDBOSSHALL_SendOpenState = 2;
	public static final byte WORLDBOSSHALL_GetRoomState = 3;
	public static final byte WORLDBOSSHALL_GetRoomStateOk = 4;
	public static final byte WORLDBOSSHALL_Start = 5;
	public static final byte WORLDBOSSHALL_StartOk = 6;
	public static final byte WORLDBOSS_StartFail = 7;
	public static final byte WORLDBOSSHALL_GetHallState = 8;
	public static final byte WORLDBOSSHALL_GetHallStateOk = 9;
	public static final byte WORLDBOSSHALL_Accelerate = 10;
	public static final byte WORLDBOSSHALL_SendSettlementInfo = 11;

	/** 弹王挑战赛 */
	public static final byte MAIN_CHALLENGE = 98;
	public static final byte CHALLENGE_GetInChallenge = 1;
	public static final byte CHALLENGE_GetInChallengeOk = 2;
	public static final byte CHALLENGE_JoinBattle = 3;
	public static final byte CHALLENGE_GetBattleTeamList = 4;
	public static final byte CHALLENGE_GetInBattleTeam = 5;
	public static final byte CHALLENGE_PlayerEnter = 6;
	public static final byte CHALLENGE_CreateBattleTeam = 7;
	public static final byte CHALLENGE_Invite = 8;
	public static final byte CHALLENGE_BeInvite = 9;
	public static final byte CHALLENGE_GameReady = 10;
	public static final byte CHALLENGE_GameReadyOk = 11;
	public static final byte CHALLENGE_QuitRoom = 12;
	public static final byte CHALLENGE_QuitRoomOk = 13;
	public static final byte CHALLENGE_PlayerQuit = 14;
	public static final byte CHALLENGE_UpdateSeat = 15;
	public static final byte CHALLENGE_GetApplyList = 17;
	public static final byte CHALLENGE_SendApplyList = 18;
	public static final byte CHALLENGE_AuditPlayer = 19;
	public static final byte CHALLENGE_AuditPlayerOK = 20;
	public static final byte CHALLENGE_ApplyJoin = 21;
	public static final byte CHALLENGE_ApplyJoinOk = 22;
	public static final byte CHALLENGE_GetRankList = 23;
	public static final byte CHALLENGE_SendRankList = 24;
	public static final byte CHALLENGE_NoticeLeader = 25;
	public static final byte CHALLENGE_MakePair = 26;
	public static final byte CHALLENGE_BackToRoom = 27;
	public static final byte CHALLENGE_QuitChallengeInterface = 28;
	/** 单人副本 */
	public static final byte MAIN_SINGLEMAP = 99;
	public static final byte SINGLEMAP_GetPoints = 1;
	public static final byte SINGLEMAP_GetPointsOk = 2;
	public static final byte SINGLEMAP_StartChallenge = 3;
	public static final byte SINGLEMAP_StartChallengeOk = 4;
	public static final byte SINGLEMAP_ChallengeSuccess = 5;
	public static final byte SINGLEMAP_ChallengeSuccessOk = 6;
	public static final byte SINGLEMAP_StartRaids = 7;
	public static final byte SINGLEMAP_StartRaidsOk = 8;
	public static final byte SINGLEMAP_ChallengeFail = 9;
	public static final byte SINGLEMAP_IllegalData = 10;
	public static final byte SINGLEMAP_GetBigPointList = 11;
	public static final byte SINGLEMAP_GetBigPointListOk = 12;
	public static final byte SINGLEMAP_GetVigorPrice = 13;
	public static final byte SINGLEMAP_GetVigorPriceOk = 14;
	public static final byte SINGLEMAP_BuyVigor = 15;
	public static final byte SINGLEMAP_BuyVigorOk = 16;
	/** 星魂系统 */
	public static final byte MAIN_STARSOUL = 100;
	public static final byte STARSOUL_GetStarSoul = 1;
	public static final byte STARSOUL_GetStarSoulOk = 2;
	public static final byte STARSOUL_LightNextStar = 3;
	public static final byte STARSOUL_LightNextStarOk = 4;
	/** 卡牌 */
	public static final byte MAIN_CARD = 101;
	public static final byte CARD_ChangeCard = 1;
	public static final byte CARD_ChangeCardOk = 2;
	public static final byte CARD_MergeCard = 3;
	public static final byte CARD_MergeCardOk = 4;
	public static final byte CARD_MeltCard = 5;
	public static final byte CARD_MeltCardOk = 6;
	public static final byte CARD_ExchangeList = 7;
	public static final byte CARD_ExchangeListOk = 8;
	public static final byte CARD_Exchange = 9;
	public static final byte CARD_ExchangeOk = 10;
	public static final byte CARD_RefreshList = 11;
	public static final byte CARD_GetPlayerCards = 12;
	public static final byte CARD_GetPlayerCardsOk = 13;

	/** 缓存 */
	public static final byte MAIN_CACHE = 102;
	public static final byte CACHE_PlayerInfo = 1;
	public static final byte CACHE_PlayerItem = 2;
	public static final byte CACHE_StrongRateList = 3;
	public static final byte CACHE_StarConfig = 4;
	public static final byte CACHE_UpdatePlayer = 5;
	public static final byte CACHE_AddItem = 6;
	public static final byte CACHE_RemoveItem = 7;
	public static final byte CACHE_UpdateItem = 8;
	public static final byte CACHE_PlayerPet = 9;
	public static final byte CACHE_ShopList = 10;
	public static final byte CACHE_WishList = 11;
	public static final byte CACHE_ZflhList = 12;
	public static final byte CACHE_AddPet = 13;
	public static final byte CACHE_UpdatePet = 14;
	public static final byte CACHE_ChangeShop = 15;

	/** 修炼系统 */
	public static final byte MAIN_PRACTICE = 103;
	public static final byte PRACTICE_GetPractice = 1;
	public static final byte PRACTICE_GetPracticeOk = 2;
	public static final byte PRACTICE_LightNextPractice = 3;
	public static final byte PRACTICE_LightNextPracticeOk = 4;
	public static final byte PRACTICE_ActivatePractice = 5;
	public static final byte PRACTICE_ActivatePracticeOk = 6;

	/** 月卡系统 */
	public static final byte MAIN_MONTHCARD = 104;
	public static final byte MONTHCARD_GetMonthCardList = 1;
	public static final byte MONTHCARD_GetMonthCardListOk = 2;
	public static final byte MONTHCARD_ReceiveRebate = 3;
	public static final byte MONTHCARD_ReceiveRebateOk = 4;
	public static final byte MONTHCARD_CardOverdue = 5;
	public static final byte MONTHCARD_CashProductBuySuccess = 6;

	/** 道具使用 */
	public static final byte MAIN_USEITEMS = 105;
	public static final byte USEITEMS_UseObject = 1;
	public static final byte USEITEMS_UseObjectOK = 2;
}
