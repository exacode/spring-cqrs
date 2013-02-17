package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgProcPronameArgsNspIndex is a Querydsl query type for QPgProcPronameArgsNspIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgProcPronameArgsNspIndex extends com.mysema.query.sql.RelationalPathBase<QPgProcPronameArgsNspIndex> {

    private static final long serialVersionUID = -1338081749;

    public static final QPgProcPronameArgsNspIndex pgProcPronameArgsNspIndex = new QPgProcPronameArgsNspIndex("pg_proc_proname_args_nsp_index");

    public final SimplePath<Object> proargtypes = createSimple("proargtypes", Object.class);

    public final SimplePath<Object> proname = createSimple("proname", Object.class);

    public final NumberPath<Long> pronamespace = createNumber("pronamespace", Long.class);

    public QPgProcPronameArgsNspIndex(String variable) {
        super(QPgProcPronameArgsNspIndex.class, forVariable(variable), "pg_catalog", "pg_proc_proname_args_nsp_index");
    }

    @SuppressWarnings("all")
    public QPgProcPronameArgsNspIndex(Path<? extends QPgProcPronameArgsNspIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_proc_proname_args_nsp_index");
    }

    public QPgProcPronameArgsNspIndex(PathMetadata<?> metadata) {
        super(QPgProcPronameArgsNspIndex.class, metadata, "pg_catalog", "pg_proc_proname_args_nsp_index");
    }

}

