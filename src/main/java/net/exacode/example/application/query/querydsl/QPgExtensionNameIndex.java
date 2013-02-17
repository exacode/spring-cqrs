package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgExtensionNameIndex is a Querydsl query type for QPgExtensionNameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgExtensionNameIndex extends com.mysema.query.sql.RelationalPathBase<QPgExtensionNameIndex> {

    private static final long serialVersionUID = 952739363;

    public static final QPgExtensionNameIndex pgExtensionNameIndex = new QPgExtensionNameIndex("pg_extension_name_index");

    public final SimplePath<Object> extname = createSimple("extname", Object.class);

    public QPgExtensionNameIndex(String variable) {
        super(QPgExtensionNameIndex.class, forVariable(variable), "pg_catalog", "pg_extension_name_index");
    }

    @SuppressWarnings("all")
    public QPgExtensionNameIndex(Path<? extends QPgExtensionNameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_extension_name_index");
    }

    public QPgExtensionNameIndex(PathMetadata<?> metadata) {
        super(QPgExtensionNameIndex.class, metadata, "pg_catalog", "pg_extension_name_index");
    }

}

