package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgCollationNameEncNspIndex is a Querydsl query type for QPgCollationNameEncNspIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgCollationNameEncNspIndex extends com.mysema.query.sql.RelationalPathBase<QPgCollationNameEncNspIndex> {

    private static final long serialVersionUID = 1550234440;

    public static final QPgCollationNameEncNspIndex pgCollationNameEncNspIndex = new QPgCollationNameEncNspIndex("pg_collation_name_enc_nsp_index");

    public final NumberPath<Integer> collencoding = createNumber("collencoding", Integer.class);

    public final SimplePath<Object> collname = createSimple("collname", Object.class);

    public final NumberPath<Long> collnamespace = createNumber("collnamespace", Long.class);

    public QPgCollationNameEncNspIndex(String variable) {
        super(QPgCollationNameEncNspIndex.class, forVariable(variable), "pg_catalog", "pg_collation_name_enc_nsp_index");
    }

    @SuppressWarnings("all")
    public QPgCollationNameEncNspIndex(Path<? extends QPgCollationNameEncNspIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_collation_name_enc_nsp_index");
    }

    public QPgCollationNameEncNspIndex(PathMetadata<?> metadata) {
        super(QPgCollationNameEncNspIndex.class, metadata, "pg_catalog", "pg_collation_name_enc_nsp_index");
    }

}

