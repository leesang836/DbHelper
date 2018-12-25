package com.wangtao.dbhelper.datasource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by wangtao at 2018/12/24 15:50
 */
public class SimpleDataSourceFactory implements DataSourceFactory {

    private SimpleDataSourceFactory() {}

    @Override
    public DataSource getDataSource(Properties properties) {
        return new SimpleDataSource(properties);
    }

    public static DataSourceFactory instance() {
        return Holder.getInstance();
    }

    private static class Holder {
        private static DataSourceFactory factory = new SimpleDataSourceFactory();

        static DataSourceFactory getInstance() {
            return factory;
        }
    }
}