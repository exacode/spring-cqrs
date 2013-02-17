package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDependDependerIndex is a Querydsl query type for QPgDependDependerIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDependDependerIndex extends com.mysema.query.sql.RelationalPathBase<QPgDependDependerIndex> {

    private static final long serialVersionUID = 2018096626;

    public static final QPgDependDependerIndex pgDependDependerIndex = new QPgDependDependerIndex("pg_depend_depender_index");

    public final NumberPath<Long> classid = createNumber("classid", Long.class);

    public final NumberPath<Long> objid = createNumber("objid", Long.class);

    public final NumberPath<Integer> objsubid = createNumber("objsubid", Integer.class);

    public QPgDependDependerIndex(String variable) {
        super(QPgDependDependerIndex.class, forVariable(variable), "pg_catalog", "pg_depend_depender_index");
    }

    @SuppressWarnings("all")
    public QPgDependDependerIndex(Path<? extends QPgDependDependerIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_depend_depender_index");
    }

    public QPgDependDependerIndex(PathMetadata<?> metadata) {
        super(QPgDependDependerIndex.class, metadata, "pg_catalog", "pg_depend_depender_index");
    }

}

