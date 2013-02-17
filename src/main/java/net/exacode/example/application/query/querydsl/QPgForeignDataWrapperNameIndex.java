package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgForeignDataWrapperNameIndex is a Querydsl query type for QPgForeignDataWrapperNameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgForeignDataWrapperNameIndex extends com.mysema.query.sql.RelationalPathBase<QPgForeignDataWrapperNameIndex> {

    private static final long serialVersionUID = -1436164041;

    public static final QPgForeignDataWrapperNameIndex pgForeignDataWrapperNameIndex = new QPgForeignDataWrapperNameIndex("pg_foreign_data_wrapper_name_index");

    public final SimplePath<Object> fdwname = createSimple("fdwname", Object.class);

    public QPgForeignDataWrapperNameIndex(String variable) {
        super(QPgForeignDataWrapperNameIndex.class, forVariable(variable), "pg_catalog", "pg_foreign_data_wrapper_name_index");
    }

    @SuppressWarnings("all")
    public QPgForeignDataWrapperNameIndex(Path<? extends QPgForeignDataWrapperNameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_foreign_data_wrapper_name_index");
    }

    public QPgForeignDataWrapperNameIndex(PathMetadata<?> metadata) {
        super(QPgForeignDataWrapperNameIndex.class, metadata, "pg_catalog", "pg_foreign_data_wrapper_name_index");
    }

}

