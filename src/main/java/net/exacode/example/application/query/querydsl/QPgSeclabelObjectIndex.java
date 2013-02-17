package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgSeclabelObjectIndex is a Querydsl query type for QPgSeclabelObjectIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgSeclabelObjectIndex extends com.mysema.query.sql.RelationalPathBase<QPgSeclabelObjectIndex> {

    private static final long serialVersionUID = -627643307;

    public static final QPgSeclabelObjectIndex pgSeclabelObjectIndex = new QPgSeclabelObjectIndex("pg_seclabel_object_index");

    public final NumberPath<Long> classoid = createNumber("classoid", Long.class);

    public final NumberPath<Long> objoid = createNumber("objoid", Long.class);

    public final NumberPath<Integer> objsubid = createNumber("objsubid", Integer.class);

    public final StringPath provider = createString("provider");

    public QPgSeclabelObjectIndex(String variable) {
        super(QPgSeclabelObjectIndex.class, forVariable(variable), "pg_catalog", "pg_seclabel_object_index");
    }

    @SuppressWarnings("all")
    public QPgSeclabelObjectIndex(Path<? extends QPgSeclabelObjectIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_seclabel_object_index");
    }

    public QPgSeclabelObjectIndex(PathMetadata<?> metadata) {
        super(QPgSeclabelObjectIndex.class, metadata, "pg_catalog", "pg_seclabel_object_index");
    }

}

