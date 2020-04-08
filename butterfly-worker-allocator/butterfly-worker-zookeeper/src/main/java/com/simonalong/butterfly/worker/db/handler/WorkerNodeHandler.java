package com.simonalong.butterfly.worker.db.handler;

/**
 * 节点 worker_xx 读取和更新管理器
 *
 * @author shizi
 * @since 2020/2/7 1:02 上午
 */
public interface WorkerNodeHandler
{
    /**
     * 当前业务的key
     */
    String getUidKey();

    /**
     * 当前工作节点的下次失效时间
     */
    Long getLastExpireTime();

    /**
     * ip信息
     */
    String getIp();

    /**
     * 进程id
     */
    String getProcessId();

    /**
     * 获取节点的下表索引
     */
    Integer getWorkerId();

    /**
     * 刷新节点信息
     */
    void refreshNodeInfo();

    /**
     * 刷新worker节点信息
     */
    void refreshNodeInfo(String workerNodePath);
}