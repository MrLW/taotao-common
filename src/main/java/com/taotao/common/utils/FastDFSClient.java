package com.taotao.common.utils;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;


public class FastDFSClient {
    private TrackerClient trackerClient = null;
    private TrackerServer trackerServer = null;
    private StorageServer storageServer = null;
    //使用StorageClient1进行上传
    private StorageClient1 storageClient1 = null;

    public FastDFSClient(String conf) throws Exception {
        //获取classpath路径下配置文件"fdfs_client.conf"的路径
        //conf直接写相对于classpath的位置，不需要写classpath:
//    	ClassLoader classLoader = this.getClass().getClassLoader();
//    	System.out.println("classLoader:" + classLoader);
//    	System.out.println("conf:" + conf);
//    	URL url = classLoader.getResource(conf);
//    	System.out.println("url:" + url);
//        String configPath = url.getFile();
//        System.out.println("configPath" + configPath);
        ClientGlobal.init(conf);
        // 创建TrackerClient
        trackerClient = new TrackerClient();
        // 获取TrackerServer
        trackerServer = trackerClient.getConnection();
        // 通过TrackerServer获取StorageServer
        storageServer = trackerClient.getStoreStorage(trackerServer);
        // 通过trackerServer、storageServer获取StorageClient
        storageClient1 = new StorageClient1(trackerServer, storageServer);
    }
    
    public String uploadFile(byte[] file_buff, String file_ext_name) throws Exception {

        String result = storageClient1.upload_file1(file_buff, file_ext_name, null);

        return result;
    }

    public String uploadFile(String local_filename, String file_ext_name) throws Exception {

        String result = storageClient1.upload_file1(local_filename, file_ext_name, null);

        return result;
    }
}